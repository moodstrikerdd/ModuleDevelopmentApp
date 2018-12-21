package com.moodstrikerdd.lib_common.adapter.recyclerview.support;

public interface SectionSupport<T>
{
    public int sectionHeaderLayoutId();

    public int sectionTitleTextViewId();

    public String getTitle(T t);
}
