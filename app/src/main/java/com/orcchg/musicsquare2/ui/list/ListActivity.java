package com.orcchg.musicsquare2.ui.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hannesdorfmann.mosby.mvp.MvpView;
import com.orcchg.musicsquare2.R;
import com.orcchg.musicsquare2.ui.details.DetailsActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListActivity extends AppCompatActivity implements MvpView {

    @Inject ListPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
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

    @OnClick(R.id.button_details)
    public void details() {
        startActivity(new Intent(this, DetailsActivity.class));
    }
}
