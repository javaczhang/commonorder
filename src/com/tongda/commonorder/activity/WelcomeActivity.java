package com.tongda.commonorder.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.tongda.commonorder.R;

/**
 * @Author andy
 */
public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcomelogo);
		// 得到ImageView控件
		ImageView logo = (ImageView) findViewById(R.id.logo2);
		// 使用xml中自定义的动画效果
		Animation logo_animation = AnimationUtils.loadAnimation(WelcomeActivity.this, R.anim.push_left_in);
		logo.setAnimation(logo_animation);
		logo_animation.setAnimationListener(new AnimationListener() {

			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onAnimationEnd(Animation animation) {
				// TODO Auto-generated method stub
				Intent it = new Intent(WelcomeActivity.this, MainActivity.class);
				startActivity(it);
				// overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
				WelcomeActivity.this.finish();
			}
		});
	}
}
