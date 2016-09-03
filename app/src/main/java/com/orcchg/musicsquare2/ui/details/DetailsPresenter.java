package com.orcchg.musicsquare2.ui.details;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.orcchg.musicsquare2.domain.interactor.DefaultSubscriber;
import com.orcchg.musicsquare2.domain.interactor.UseCase;
import com.orcchg.musicsquare2.domain.model.Musician;

import java.util.List;

import javax.inject.Inject;

public class DetailsPresenter extends MvpBasePresenter{

    private final UseCase getMusicianDetailsUseCase;

    @Inject
    public DetailsPresenter(UseCase getMusicianDetailsUseCase) {
        this.getMusicianDetailsUseCase = getMusicianDetailsUseCase;
    }

    void resume() {
        this.getMusicianDetails();
    }

    private void getMusicianDetails() {
        this.getMusicianDetailsUseCase.execute(new MusicianDetailsSubscriber());
    }

    private final class MusicianDetailsSubscriber extends DefaultSubscriber<List<Musician>> {
        @Override
        public void onCompleted() {
            super.onCompleted();
            // TODO: hide loading
        }

        @Override
        public void onNext(List<Musician> musicien) {
            super.onNext(musicien);
            // TODO: show details of musician
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            // TODO: hide loading
            // TODO: show error view
        }
    }
}
