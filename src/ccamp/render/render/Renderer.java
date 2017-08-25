package ccamp.render.render;

import ccamp.Renderable;
import ccamp.render.Canvas;
import ccamp.render.renderinfo.OvalRenderInfo;
import ccamp.render.renderinfo.RawRenderInfo;
import ccamp.render.renderinfo.RectRenderInfo;
import ccamp.render.renderinfo.RenderInfo;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Renderer {

    public Renderer() {
    }

    public void renderScene(Canvas canvas, List<Renderable> renderable) {
        // Iterate through list of renderables

        Graphics2D graphics2D = canvas.getCanvasGraphics();
        graphics2D.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

        for (Renderable renderable1 : renderable) {
            List<RenderInfo> topRenderInfos = renderable1.getRenderInfo();
            // Iterate through sub lists
            for (RenderInfo renderInfo : topRenderInfos) {
                if (renderInfo instanceof RectRenderInfo) {
                    RectRenderInfo s = (RectRenderInfo) renderInfo;
                    this.rectRenderInfo(graphics2D, s);
                }
                if (renderInfo instanceof OvalRenderInfo) {
                    OvalRenderInfo s = (OvalRenderInfo) renderInfo;
                    this.ovalRenderInfo(graphics2D, s);
                }
            }
            canvas.repaint();
        }
    }

    private void rectRenderInfo(Graphics2D graphics2D, RectRenderInfo r){
        graphics2D.setColor(r.getColor());
        graphics2D.fillRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    private void ovalRenderInfo(Graphics2D graphics2D, OvalRenderInfo r){
        graphics2D.setColor(r.getColor());
        graphics2D.fillOval(r.getX(), r.getY(), r.getBallradius(), r.getBallradius());
    }



}