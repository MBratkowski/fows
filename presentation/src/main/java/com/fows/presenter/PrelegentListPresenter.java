package com.fows.presenter;

import com.fows.contract.PrelegentDetailsContract;
import com.fows.contract.PrelegentListContract;
import com.fows.entity.Prelegent;
import com.fows.presenter.base.DataPresenterImpl;
import com.fows.presenter.base.definition.DataPresenter;

/**
 * Created by mateusz.bratkowski on 13/11/16.
 */
public class PrelegentListPresenter extends DataPresenterImpl<PrelegentListContract.View, Prelegent>
        implements PrelegentListContract.Presenter {

    @Override
    public void refresh() {

    }
}
