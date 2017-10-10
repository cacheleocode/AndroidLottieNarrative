package com.example.domingl.androidlottienarrative;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView animationViewRemoteStart;
    private LottieAnimationView animationViewRemoteLoop;
    private LottieAnimationView animationViewPairingStart;
    private LottieAnimationView animationViewPairingLoop;
    private LottieAnimationView animationViewPairingEnd;
    private LottieAnimationView animationViewLocationStart;

    private Integer step = 0;
    private Boolean success = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        // general test
        LottieAnimationView animationView = findViewById(R.id.animation_view);
        animationView.setAnimation("att_logo_zoom.json");
        animationView.loop(true);
        animationView.playAnimation();
        */

        animationViewRemoteStart = findViewById(R.id.animation_view_remote_start);
        animationViewRemoteStart.setAnimation("remote_start.json");
        animationViewRemoteStart.loop(false);

        animationViewRemoteStart.playAnimation();
        step = 1;

        animationViewRemoteStart.addAnimatorUpdateListener(new AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                if (animator.getAnimatedFraction() == 1.0) {
                    animationViewRemoteStart.setVisibility(View.INVISIBLE);
                    animationViewRemoteLoop.setVisibility(View.VISIBLE);
                    animationViewRemoteLoop.playAnimation();
                }
            }
        });

        animationViewRemoteLoop = findViewById(R.id.animation_view_remote_loop);
        animationViewRemoteLoop.setAnimation("remote_loop.json");
        animationViewRemoteLoop.loop(true);

        animationViewPairingStart = findViewById(R.id.animation_view_pairing_start);
        animationViewPairingStart.setAnimation("pairing_start.json");
        animationViewPairingStart.loop(false);

        animationViewPairingStart.addAnimatorUpdateListener(new AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                if (animator.getAnimatedFraction() == 1.0) {
                    animationViewPairingStart.setVisibility(View.INVISIBLE);
                    animationViewPairingLoop.setVisibility(View.VISIBLE);
                    animationViewPairingLoop.playAnimation();
                }
            }
        });

        animationViewPairingLoop = findViewById(R.id.animation_view_pairing_loop);
        animationViewPairingLoop.setAnimation("pairing_loop.json");
        animationViewPairingLoop.loop(true);

        animationViewPairingEnd = findViewById(R.id.animation_view_pairing_end);
        animationViewPairingEnd.setAnimation("pairing_end.json");
        animationViewPairingEnd.loop(false);

        animationViewPairingEnd.addAnimatorUpdateListener(new AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animator) {
                if (animator.getAnimatedFraction() == 1.0) {
                    animationViewPairingEnd.setVisibility(View.INVISIBLE);
                    animationViewLocationStart.setVisibility(View.VISIBLE);
                    animationViewLocationStart.playAnimation();
                }
            }
        });

        animationViewLocationStart = findViewById(R.id.animation_view_location_start);
        animationViewLocationStart.setAnimation("location_start.json");
        animationViewLocationStart.loop(false);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_LEFT:
                return true;
            case KeyEvent.KEYCODE_DPAD_RIGHT:

                return true;
            case KeyEvent.KEYCODE_DPAD_CENTER:
                if (animationViewRemoteLoop.isAnimating()) {
                    animationViewRemoteLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);

                            if (animator.getAnimatedFraction() == 1.0) {
                                animationViewRemoteLoop.setVisibility(View.INVISIBLE);
                                animationViewRemoteLoop.pauseAnimation();
                                animationViewPairingStart.setVisibility(View.VISIBLE);
                                animationViewPairingStart.playAnimation();
                            }
                        }
                    });
                }

                if (animationViewPairingLoop.isAnimating()) {
                    animationViewPairingLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);

                            if (animator.getAnimatedFraction() == 1.0) {
                                animationViewPairingLoop.setVisibility(View.INVISIBLE);
                                animationViewPairingLoop.pauseAnimation();
                                animationViewPairingEnd.setVisibility(View.VISIBLE);
                                animationViewPairingEnd.playAnimation();
                            }
                        }
                    });
                }

                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }
}
