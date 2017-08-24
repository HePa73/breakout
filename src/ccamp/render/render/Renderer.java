package ccamp.render.render;

import ccamp.Renderable;
import ccamp.render.Canvas;
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
            List<RenderInfo> topRenderInfos= renderable1.getRenderInfo();
            // Iterate through sub lists
            for (RenderInfo renderInfo: topRenderInfos)
                if (renderInfo instanceof RectRenderInfo) {
                    RectRenderInfo s = (RectRenderInfo) renderInfo;
                    this.rectRenderInfo(canvas, s);
                }
        }
        canvas.repaint();
    }

    private void rectRenderInfo(Canvas canvas, RectRenderInfo r){
        canvas.getImage().getGraphics().drawRect(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public void addRenderable(Renderable renderable){
        this.renderable.add(renderable);
    }
}