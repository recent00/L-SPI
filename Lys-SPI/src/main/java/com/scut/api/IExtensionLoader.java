package com.scut.api;

public interface IExtensionLoader<T> {
    T getExtension(String alias);
}
