/*
 * Copyright (c) 2018 Hai Zhang <dreaming.in.code.zh@gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.files.provider.archive.reader;

import org.apache.commons.compress.compressors.CompressorException;

import java.io.IOException;

public class ArchiveException extends IOException {

    public ArchiveException(org.apache.commons.compress.archivers.ArchiveException cause) {
        super(cause);
    }

    public ArchiveException(CompressorException cause) {
        super(cause);
    }
}
