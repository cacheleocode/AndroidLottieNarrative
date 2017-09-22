package com.example.domingl.androidlottienarrative;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    int step = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // Lottie Animation
        LottieAnimationView animationViewRemote = (LottieAnimationView) findViewById(R.id.animation_view_remote);
        animationViewRemote.setAnimation("remote.json");
        animationViewRemote.loop(true);
        animationViewRemote.playAnimation();
        */

        final LottieAnimationView animationViewNarrative = (LottieAnimationView) findViewById(R.id.animation_view_narrative);
        animationViewNarrative.setAnimation("narrative.json");



        animationViewNarrative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationViewNarrative.playAnimation();
                step = step + 1;
            }
        });

        animationViewNarrative.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                animation.setInterpolator(new LinearInterpolator());

                Log.d("pizza", "onAnimationUpdate: " + animation.getAnimatedFraction() + ", step = " + step);

                if (animationViewNarrative.isAnimating() && animation.getAnimatedFraction() >= 0.65568862f && step == 1) {
                    animationViewNarrative.cancelAnimation();
                    animationViewNarrative.setProgress(0.37724550f);
                    animationViewNarrative.playAnimation();
                    step = 1;
                } else if (animationViewNarrative.isAnimating() && animation.getAnimatedFraction() >= 1f && step == 2) {
                    animationViewNarrative.cancelAnimation();
                    animationViewNarrative.setProgress(0.73353293f);
                    animationViewNarrative.playAnimation();
                    step = 2;
                }
            }
        });
    }
}
