package com.fows.presenter.base.definition;

import com.fows.presenter.base.definition.BasePresenter;
import com.fows.view.DataView;

/**
 * Created by mateusz.bratkowski on 11/11/16.
 */
public interface DataPresenter<ViewType extends DataView, DataType> extends BasePresenter<ViewType> {

    void onDataLoaded(DataType dataType);

    void refresh();
}
