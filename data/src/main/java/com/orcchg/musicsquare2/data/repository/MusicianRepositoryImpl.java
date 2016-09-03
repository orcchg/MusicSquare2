package com.orcchg.musicsquare2.data.repository;

import com.orcchg.musicsquare2.domain.model.Musician;
import com.orcchg.musicsquare2.domain.repository.MusicianRepository;

import java.util.List;

import rx.Observable;

public class MusicianRepositoryImpl implements MusicianRepository {

    @Override
    public Observable<List<Musician>> musicians() {
        return null;
    }

    @Override
    public Observable<Musician> musician(int id) {
        return null;
    }
}
