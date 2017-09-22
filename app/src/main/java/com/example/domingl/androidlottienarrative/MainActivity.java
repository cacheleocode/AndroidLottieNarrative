package com.example.domingl.androidlottienarrative;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    int step = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LottieAnimationView animationViewNarrative = (LottieAnimationView) findViewById(R.id.animation_view_narrative);
        animationViewNarrative.setAnimation("narrative.json");

        animationViewNarrative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                animationViewNarrative.playAnimation();


            }
        });

        animationViewNarrative.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.d("pizza", "onAnimationUpdate: " + animation.getAnimatedFraction() + ", step = " + step);


            }
        });


        // Custom animation speed or duration.
        ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f).setDuration(50000);

        animator.addUpdateListener(new AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                animationViewNarrative.setProgress(animation.getAnimatedFraction());
            }
        });
        animator.start();

        /*
        animationViewNarrative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationViewNarrative.playAnimation();

                if (step == 0) {
                    step = 1;
                } else if (step == 1) {
                    step = 2;
                }
            }
        });

        animationViewNarrative.addAnimatorUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                animation.setInterpolator(new LinearInterpolator());

                Log.d("pizza", "onAnimationUpdate: " + animation.getAnimatedFraction() + ", step = " + step);

                if (step == 1) {

                    if (animationViewNarrative.isAnimating() && animation.getAnimatedFraction() >= 0.65568862f) {
                        animationViewNarrative.cancelAnimation();
                        animationViewNarrative.setProgress(0.37724550f);
                        animationViewNarrative.playAnimation();
                        step = 1;
                    }

                } else if (step == 2) {

                    if (animationViewNarrative.isAnimating() && animation.getAnimatedFraction() == 0.9f) {
                        animationViewNarrative.cancelAnimation();
                        animationViewNarrative.setProgress(0.73353293f);
                        animationViewNarrative.playAnimation();
                        step = 2;
                    }

                }
            }
        });
        */
    }
}
