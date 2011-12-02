/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vogar.android;

import java.io.File;
import vogar.Result;
import vogar.tasks.Task;

public final class DeleteDeviceFilesTask extends Task {
    private final AndroidSdk androidSdk;
    private final File dir;

    public DeleteDeviceFilesTask(AndroidSdk androidSdk, File dir) {
        super("delete " + dir);
        this.androidSdk = androidSdk;
        this.dir = dir;
    }

    @Override protected Result execute() throws Exception {
        androidSdk.rm(dir);
        return Result.SUCCESS;
    }
}
