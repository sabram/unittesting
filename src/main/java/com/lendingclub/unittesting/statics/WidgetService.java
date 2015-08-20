package com.lendingclub.unittesting.statics;

public class WidgetService {

    public Widget getStandardizedWidget() {
        Widget widget = WidgetDao.getWidget();
        if (widget != null) {
            widget.setStandardized(true);
        }
        return widget;
    }

}