package com.orcchg.musicsquare2.ui.list;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.widget.Button;

import com.hannesdorfmann.mosby.mvp.MvpActivity;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.orcchg.musicsquare2.R;
import com.orcchg.musicsquare2.ui.details.DetailsActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ListActivity extends MvpActivity {

    @BindView(R.id.button_details) Button buttonDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_details)
    public void details() {
        startActivity(new Intent(this, DetailsActivity.class));
    }

    @NonNull
    @Override
    public MvpPresenter createPresenter() {
        return new ListPresenter();
    }
}
