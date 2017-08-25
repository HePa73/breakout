package ccamp.render.render;

import ccamp.Renderable;
import ccamp.render.Canvas;
import ccamp.render.renderinfo.OvalRenderInfo;
import ccamp.render.renderinfo.RawRenderInfo;
import ccamp.render.renderinfo.RectRenderInfo;
import ccamp.render.renderinfo.RenderInfo;

import java.util.LinkedList;
import java.util.List;

public class Renderer {
    List<Renderable> renderable;

    public Renderer() {
        this.renderable = new LinkedList<>();
    }

    public void renderScene(Canvas canvas){
        // Iterate through list of renderables
        for (Renderable renderable1: renderable){
            List<RenderInfo> renderInfos= renderable1.getRenderInfo();
            // Iterate through sub lists
            for (RenderInfo renderInfo: renderInfos){
                if (renderInfo instanceof RectRenderInfo){
                    RectRenderInfo s = (RectRenderInfo) renderInfo;
                    this.rectRenderInfo(canvas, s);
                }
                if (renderInfo instanceof OvalRenderInfo) {
                    OvalRenderInfo s = (OvalRenderInfo) renderInfo;
                    this.ovalRenderInfo(canvas, s);
                }
            }

        }
        canvas.repaint();
    }


    private void rectRenderInfo(Canvas canvas, RectRenderInfo r){
        canvas.getImage().getGraphics().drawRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    private void ovalRenderInfo(Canvas canvas, OvalRenderInfo r){
        canvas.getImage().getGraphics().fillOval(r.getX(), r.getY(), r.getBallradius(), r.getBallradius());
    }

    public void addRenderable(Renderable renderable){
        this.renderable.add(renderable);
    }
}
