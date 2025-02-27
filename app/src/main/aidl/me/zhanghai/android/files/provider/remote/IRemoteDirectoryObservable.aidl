package me.zhanghai.android.files.provider.remote;

import me.zhanghai.android.files.provider.remote.ParcelableException;
import me.zhanghai.android.files.util.RemoteCallback;

interface IRemoteDirectoryObservable {

    void addObserver(in RemoteCallback observer);

    void close(out ParcelableException exception);
}
