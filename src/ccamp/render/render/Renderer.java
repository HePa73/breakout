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

    public Renderer(Canvas canvas) {
        this.renderable = new LinkedList<>();
    }

    public void renderScene(List<Renderable> renderable){
        // Iterate through list of renderables
        for (Renderable renderable1: renderable){
            List<RenderInfo> renderInfos= renderable1.getRenderInfo();
            // Iterate through sub lists
            for (RenderInfo renderInfo: renderInfos){
                if (renderInfo instanceof RectRenderInfo){
                    RectRenderInfo s = (RectRenderInfo) renderInfo;

                }
            }

        }
    }

    private void rectRenderInfo(Canvas canvas, RectRenderInfo r){
        canvas.getImage().getGraphics().drawRect(r.getX(), r,getY(), r.getWidth(), r.getHeight());
    }
}
