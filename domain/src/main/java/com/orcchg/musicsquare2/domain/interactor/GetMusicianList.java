package com.orcchg.musicsquare2.domain.interactor;

import com.orcchg.musicsquare2.domain.executor.PostExecutionThread;
import com.orcchg.musicsquare2.domain.executor.ThreadExecutor;
import com.orcchg.musicsquare2.domain.repository.MusicianRepository;

import javax.inject.Inject;

import rx.Observable;

public class GetMusicianList extends UseCase {

    private final MusicianRepository repository;

    @Inject
    public GetMusicianList(MusicianRepository repository,
                           ThreadExecutor threadExecutor,
                           PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.repository = repository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return this.repository.musicians();
    }
}
