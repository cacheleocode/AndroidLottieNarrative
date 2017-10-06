package com.example.domingl.androidlottienarrative;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView animationView = findViewById(R.id.animation_view);
        animationView.setAnimation("particles_test.json");
        animationView.loop(true);
        animationView.playAnimation();

        /*
        final LottieAnimationView animationViewTest2 = (LottieAnimationView) findViewById(R.id.animation_view_test2);
        animationViewTest2.setAnimation("spinner.json");
        animationViewTest2.loop(true);


        animationViewTest2.setImageAssetDelegate(new ImageAssetDelegate() {
            @Override public Bitmap fetchBitmap(LottieImageAsset asset) {
                // Your bitmap fetching code

                Bitmap returnBitmap = null;

                returnBitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.avatar);

                return returnBitmap;
            }
        });


        animationViewTest2.playAnimation();
        */













        /*
        // Custom animation speed or duration.
        ValueAnimator animator = ValueAnimator.ofFloat(0.37724550f, 0.65568862f).setDuration(3000);

        animator.addUpdateListener(new AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                animationViewNarrative.setProgress(animation.getAnimatedFraction());
            }
        });
        animator.start();
        */

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
