package com.orcchg.musicsquare2.domain.interactor;

import com.orcchg.musicsquare2.domain.executor.PostExecutionThread;
import com.orcchg.musicsquare2.domain.executor.ThreadExecutor;
import com.orcchg.musicsquare2.domain.repository.MusicianRepository;

import javax.inject.Inject;

import rx.Observable;

public class GetMusicianDetails extends UseCase {

    private final int musicianId;
    private final MusicianRepository repository;

    @Inject
    public GetMusicianDetails(int musicianId, MusicianRepository repository,
                              ThreadExecutor threadExecutor,
                              PostExecutionThread postExecutionThread) {
        super(threadExecutor, postExecutionThread);
        this.musicianId = musicianId;
        this.repository = repository;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return this.repository.musician(this.musicianId);
    }
}
