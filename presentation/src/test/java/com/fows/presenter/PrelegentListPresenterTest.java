package com.fows.presenter;

import com.fows.UseCaseFactory;
import com.fows.aux.FowsRxTransformerProvider;
import com.fows.entity.Prelegent;
import com.fows.gateway.PrelegentGateway;
import com.fows.view.PrelegentListRowView;
import com.fows.view.PrelegentListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by mateuszbratkowski on 06.02.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class PrelegentListPresenterTest {

    @Mock
    PrelegentListRowView prelegentListRowView;

    @Mock
    PrelegentGateway prelegentGateway;

    @Mock
    PrelegentListView prelegentListView;

    UseCaseFactory useCaseFactory;

    PrelegentListPresenter presenter;

    FowsRxTransformerProvider rxTransformerProvider;

    private ArrayList<Prelegent> prelegents;

    @Before
    public void setup() {
        prelegents = new ArrayList<>();
        prelegents.add(new Prelegent(0, "", "", ""));
        prelegents.add(new Prelegent(1, "", "", ""));
        prelegents.add(new Prelegent(2, "", "", ""));
        prelegents.add(new Prelegent(3, "", "", ""));
        MockitoAnnotations.initMocks(this);
        when(prelegentGateway.getPrelegents()).thenReturn(Single.just(prelegents));
        rxTransformerProvider = new FowsRxTransformerProvider(Schedulers.io(), Schedulers.newThread());
        useCaseFactory = new UseCaseFactory(prelegentGateway, rxTransformerProvider);
        presenter = new PrelegentListPresenter(useCaseFactory);
        presenter.onAttachView(prelegentListView);
    }

    @Test
    public void getPrelegentsListTest() throws Exception {
        prelegentListView.showLoading();
        prelegentListView.hideLoading();
    }

    @Test
    public void getPrelegentDetailsTest() throws Exception {
        presenter.onAttachView(prelegentListView);
        presenter.itemClick(anyInt());
        verify(prelegentListView).showPrelegentDetails(prelegents.get(anyInt()).getId());
    }

    @Test
    public void prelegentsCountTest() throws Exception {
        presenter.getPrelegentsCount();
    }

    @Test
    public void configurePrelegentsRowTest() {
        presenter.configurePrelegentRow(prelegentListRowView, prelegents.get(anyInt()).getId());
    }
}
