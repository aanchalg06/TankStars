package com.mygdx.game.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.*;

public class Sprites extends Sprite {
    public World world;
    public Body b2body;

    public Sprites(World world){
        this.world=world;
        defineSprites();
    }

    public void defineSprites(){
        BodyDef bdef=new BodyDef();
        bdef.position.set(200,0);
        bdef.type=BodyDef.BodyType.DynamicBody;
        b2body= world.createBody(bdef);

        FixtureDef fdef=new FixtureDef();
        CircleShape shape=new CircleShape();
        shape.setRadius(5);

        fdef.shape=shape;
        b2body.createFixture(fdef);
    }
}
