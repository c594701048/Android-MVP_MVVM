package com.smxcwz.sample;

import android.os.Bundle;
import android.view.View;

import com.smxcwz.frame.eventbus.EventCenter;
import com.smxcwz.frame.netstatus.NetUtils;
import com.smxcwz.sample.base.BaseActivity;

public class MainActivity extends BaseActivity {

	@Override
	protected void getBundleExtras(Bundle extras) {

	}

	@Override
	protected int getContentViewLayoutID() {
		return R.layout.activity_main;
	}

	@Override
	protected void onEventComming(EventCenter eventCenter) {

	}

	@Override
	protected View getLoadingTargetView() {
		return null;
	}

	@Override
	protected void initViewsAndEvents() {
		setBackBtnIcon(R.mipmap.ic_launcher);
		setMenuIcon(R.mipmap.ic_launcher,R.mipmap.ic_launcher);
		setMenuText("菜单");
	}



	@Override
	protected void onNetworkConnected(NetUtils.NetType type) {

	}

	@Override
	protected void onNetworkDisConnected() {

	}

	@Override
	protected boolean isApplyStatusBarTranslucency() {
		return false;
	}

	@Override
	protected boolean isBindEventBusHere() {
		return false;
	}

	@Override
	protected boolean toggleOverridePendingTransition() {
		return false;
	}

	@Override
	protected TransitionMode getOverridePendingTransitionMode() {
		return null;
	}
}
