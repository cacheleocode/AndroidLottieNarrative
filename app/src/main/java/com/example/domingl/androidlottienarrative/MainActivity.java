package com.example.domingl.androidlottienarrative;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    private LottieAnimationView animationViewRemoteStart;
    private LottieAnimationView animationViewRemoteLoop;
    private LottieAnimationView animationViewPairingStart;
    private LottieAnimationView animationViewPairingLoop;
    private LottieAnimationView animationViewPairingEnd;
    private LottieAnimationView animationViewLocationStart;
    private LottieAnimationView animationViewSearchingStart;
    private LottieAnimationView animationViewSearchingLoop;
    private LottieAnimationView animationViewSearchingEnd;

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

        animationViewRemoteStart.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewRemoteStart.setVisibility(View.INVISIBLE);
                animationViewRemoteLoop.setVisibility(View.VISIBLE);
                animationViewRemoteLoop.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewRemoteLoop = findViewById(R.id.animation_view_remote_loop);
        animationViewRemoteLoop.setAnimation("remote_loop.json");
        animationViewRemoteLoop.loop(true);

        animationViewRemoteLoop.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewRemoteLoop.setVisibility(View.INVISIBLE);
                animationViewPairingStart.setVisibility(View.VISIBLE);
                animationViewPairingStart.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewPairingStart = findViewById(R.id.animation_view_pairing_start);
        animationViewPairingStart.setAnimation("pairing_start.json");
        animationViewPairingStart.loop(false);

        animationViewPairingStart.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewPairingStart.setVisibility(View.INVISIBLE);
                animationViewPairingLoop.setVisibility(View.VISIBLE);
                animationViewPairingLoop.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewPairingLoop = findViewById(R.id.animation_view_pairing_loop);
        animationViewPairingLoop.setAnimation("pairing_loop.json");
        animationViewPairingLoop.loop(true);

        animationViewPairingLoop.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewPairingLoop.setVisibility(View.INVISIBLE);
                animationViewPairingEnd.setVisibility(View.VISIBLE);
                animationViewPairingEnd.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewPairingEnd = findViewById(R.id.animation_view_pairing_end);
        animationViewPairingEnd.setAnimation("pairing_end.json");
        animationViewPairingEnd.loop(false);

        animationViewPairingEnd.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewPairingEnd.setVisibility(View.INVISIBLE);
                animationViewLocationStart.setVisibility(View.VISIBLE);
                animationViewLocationStart.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewLocationStart = findViewById(R.id.animation_view_location_start);
        animationViewLocationStart.setAnimation("location_start.json");
        animationViewLocationStart.loop(false);

        animationViewLocationStart.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewLocationStart.setVisibility(View.INVISIBLE);
                animationViewSearchingStart.setVisibility(View.VISIBLE);
                animationViewSearchingStart.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewSearchingStart = findViewById(R.id.animation_view_searching_start);
        animationViewSearchingStart.setAnimation("searching_start.json");
        animationViewSearchingStart.loop(false);

        animationViewSearchingStart.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewSearchingStart.setVisibility(View.INVISIBLE);
                animationViewSearchingLoop.setVisibility(View.VISIBLE);
                animationViewSearchingLoop.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewSearchingLoop = findViewById(R.id.animation_view_searching_loop);
        animationViewSearchingLoop.setAnimation("searching_loop.json");
        animationViewSearchingLoop.loop(true);

        animationViewSearchingLoop.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewSearchingLoop.setVisibility(View.INVISIBLE);
                animationViewSearchingEnd.setVisibility(View.VISIBLE);
                animationViewSearchingEnd.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewSearchingEnd = findViewById(R.id.animation_view_searching_end);
        animationViewSearchingEnd.setAnimation("searching_end.json");
        animationViewSearchingEnd.loop(false);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_LEFT:

                return true;
            case KeyEvent.KEYCODE_DPAD_RIGHT:

                return true;
            case KeyEvent.KEYCODE_DPAD_CENTER:
                if (!animationViewRemoteStart.isAnimating() && animationViewRemoteStart.getVisibility() == 0) {
                    animationViewRemoteStart.playAnimation();
                }

                if (animationViewRemoteLoop.isAnimating()) {
                    animationViewRemoteLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);
                        }
                    });
                }

                if (animationViewPairingLoop.isAnimating()) {
                    animationViewPairingLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(2);
                        }
                    });
                }

                if (animationViewSearchingLoop.isAnimating()) {
                    animationViewSearchingLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);
                        }
                    });
                }

                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }
}
