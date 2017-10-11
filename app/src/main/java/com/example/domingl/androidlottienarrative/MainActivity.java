package com.example.domingl.androidlottienarrative;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

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
    private LottieAnimationView animationViewSuccessBig;
    private LottieAnimationView animationViewProgressbarLoop;
    private FrameLayout animationViewDownloadScreen;
    private LottieAnimationView animationViewCorrectAnswer;
    private LottieAnimationView animationView3rdPartyAppBackgroundStart;
    private LottieAnimationView animationView3rdPartyAppBackgroundLoop;
    private LottieAnimationView animationView3rdPartyAppBackgroundEnd;

    private Integer step = 0;
    private Boolean success = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                step = 2;
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
                if(success == true) {
                    animationViewRemoteLoop.setVisibility(View.INVISIBLE);
                    animationViewPairingStart.setVisibility(View.VISIBLE);
                    animationViewPairingStart.playAnimation();
                    step = 3;
                    success = false;
                }
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
                step = 4;
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
                if(success == true) {
                    animationViewPairingLoop.setVisibility(View.INVISIBLE);
                    animationViewPairingEnd.setVisibility(View.VISIBLE);
                    animationViewPairingEnd.playAnimation();
                    step = 5;
                    success = false;
                }
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
                step = 6;
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
                step = 7;
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
                step = 8;
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
                if (success == true) {
                    animationViewSearchingLoop.setVisibility(View.INVISIBLE);
                    animationViewSuccessBig.setVisibility(View.VISIBLE);
                    animationViewSuccessBig.playAnimation();
                    step = 9;
                    success = false;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewSuccessBig = findViewById(R.id.animation_view_success_big);
        animationViewSuccessBig.setAnimation("success_big.json");
        animationViewSuccessBig.loop(false);

        animationViewSuccessBig.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewSuccessBig.setVisibility(View.INVISIBLE);
                animationViewDownloadScreen.setVisibility(View.VISIBLE);
                animationViewProgressbarLoop.playAnimation();
                step = 10;
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewDownloadScreen = findViewById(R.id.animation_view_download_screen);
        animationViewProgressbarLoop = findViewById(R.id.animation_view_progressbar_loop);
        animationViewProgressbarLoop.setAnimation("progressbar_loop.json");
        animationViewProgressbarLoop.loop(true);

        animationViewProgressbarLoop.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationViewDownloadScreen.setVisibility(View.INVISIBLE);
                animationViewCorrectAnswer.setVisibility(View.VISIBLE);
                animationViewCorrectAnswer.playAnimation();
                step = 11;
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationViewCorrectAnswer = findViewById(R.id.animation_view_correctanswer);
        animationViewCorrectAnswer.setAnimation("correctanswer.json");
        animationViewCorrectAnswer.loop(false);

        animationViewCorrectAnswer.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (success == true) {
                    animationViewCorrectAnswer.setVisibility(View.INVISIBLE);
                    animationView3rdPartyAppBackgroundStart.setVisibility(View.VISIBLE);
                    animationView3rdPartyAppBackgroundStart.playAnimation();
                    step = 12;
                    success = false;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationView3rdPartyAppBackgroundStart = findViewById(R.id.animation_view_3rd_party_app_background_start);
        animationView3rdPartyAppBackgroundStart.setAnimation("3rd_party_app_background_start.json");
        animationView3rdPartyAppBackgroundStart.loop(false);

        animationView3rdPartyAppBackgroundStart.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationView3rdPartyAppBackgroundStart.setVisibility(View.INVISIBLE);
                animationView3rdPartyAppBackgroundLoop.setVisibility(View.VISIBLE);
                animationView3rdPartyAppBackgroundLoop.playAnimation();
                step = 13;
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationView3rdPartyAppBackgroundLoop = findViewById(R.id.animation_view_3rd_party_app_background_loop);
        animationView3rdPartyAppBackgroundLoop.setAnimation("3rd_party_app_background_loop.json");
        animationView3rdPartyAppBackgroundLoop.loop(true);

        animationView3rdPartyAppBackgroundLoop.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (success == true) {
                    animationView3rdPartyAppBackgroundLoop.setVisibility(View.INVISIBLE);
                    animationView3rdPartyAppBackgroundEnd.setVisibility(View.VISIBLE);
                    animationView3rdPartyAppBackgroundEnd.playAnimation();
                    step = 14;
                    success = false;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        animationView3rdPartyAppBackgroundEnd = findViewById(R.id.animation_view_3rd_party_app_background_end);
        animationView3rdPartyAppBackgroundEnd.setAnimation("3rd_party_app_background_end.json");
        animationView3rdPartyAppBackgroundEnd.loop(false);

        animationView3rdPartyAppBackgroundEnd.addAnimatorListener(new AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                animationView3rdPartyAppBackgroundEnd.setVisibility(View.INVISIBLE);
                animationViewRemoteStart.setVisibility(View.VISIBLE);
                animationViewRemoteStart.playAnimation();
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
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
                            success = true;
                        }
                    });
                }

                if (animationViewPairingLoop.isAnimating()) {
                    animationViewPairingLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);
                            success = true;
                        }
                    });
                }

                if (animationViewSearchingLoop.isAnimating()) {
                    animationViewSearchingLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);
                            success = true;
                        }
                    });
                }

                if (animationViewProgressbarLoop.isAnimating()) {
                    animationViewProgressbarLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);
                            success = true;
                        }
                    });
                }

                if (animationView3rdPartyAppBackgroundLoop.isAnimating()) {
                    animationView3rdPartyAppBackgroundLoop.addAnimatorUpdateListener(new AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animator) {
                            animator.setRepeatCount(1);
                            success = true;
                        }
                    });
                }

                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }
}
