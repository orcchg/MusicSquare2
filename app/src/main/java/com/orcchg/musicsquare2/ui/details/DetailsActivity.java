package com.orcchg.musicsquare2.ui.details;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.orcchg.musicsquare2.R;

import javax.inject.Inject;

import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity implements MvpView {

    @Inject DetailsPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        presenter.attachView(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.resume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView(false);
    }
}
