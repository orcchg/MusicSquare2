package com.orcchg.musicsquare2.domain.repository;

import com.orcchg.musicsquare2.domain.model.Musician;

import java.util.List;

import rx.Observable;

public interface MusicianRepository {

    Observable<List<Musician>> musicians();

    Observable<Musician> musician(int id);
}
