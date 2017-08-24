package ccamp.render.renderinfo;

import java.awt.*;

public class OvalRenderInfo extends RawRenderInfo{

    private int ballradius;

    public OvalRenderInfo(int x, int y, Color color) {
        super(x, y,color);
        this.ballradius = ballradius;
    }

    public int getBallradius() {
        return ballradius;
    }

    public void setBallradius(int ballradius) {
        this.ballradius = ballradius;
    }
}
