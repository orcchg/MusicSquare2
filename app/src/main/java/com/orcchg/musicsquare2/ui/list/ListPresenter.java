package com.orcchg.musicsquare2.ui.list;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.orcchg.musicsquare2.domain.interactor.DefaultSubscriber;
import com.orcchg.musicsquare2.domain.interactor.UseCase;
import com.orcchg.musicsquare2.domain.model.Musician;

import java.util.List;

import javax.inject.Inject;

public class ListPresenter extends MvpBasePresenter {

    private final UseCase getMusicianListUseCase;

    @Inject
    public ListPresenter(UseCase getMusicianListUseCase) {
        this.getMusicianListUseCase = getMusicianListUseCase;
    }

    void resume() {
        this.getMusicianList();
    }

    private void getMusicianList() {
        this.getMusicianListUseCase.execute(new MusicianListSubscriber());
    }

    private final class MusicianListSubscriber extends DefaultSubscriber<List<Musician>> {
        @Override
        public void onCompleted() {
            super.onCompleted();
            // TODO: hide loading
        }

        @Override
        public void onNext(List<Musician> musicien) {
            super.onNext(musicien);
            // TODO: show list of musicien
        }

        @Override
        public void onError(Throwable e) {
            super.onError(e);
            // TODO: hide loading
            // TODO: show error view
        }
    }
}
