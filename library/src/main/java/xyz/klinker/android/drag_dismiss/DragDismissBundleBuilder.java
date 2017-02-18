/*
 * Copyright (C) 2017 Luke Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.klinker.android.drag_dismiss;

import android.graphics.Color;
import android.os.Bundle;

public class DragDismissBundleBuilder {

    protected static final String EXTRA_THEME = "arg_base_theme";
    protected static final String EXTRA_PRIMARY_COLOR = "arg_primary_color";
    protected static final String EXTRA_TOOLBAR_TITLE = "arg_toolbar_title";

    public enum Theme {
        LIGHT, DARK, DAY_NIGHT
    }

    private Theme theme = Theme.DAY_NIGHT;
    private int primaryColor = Color.BLACK;
    private String toolbarTitle = null;

    public Bundle build() {
        Bundle bundle = new Bundle();

        bundle.putString(EXTRA_TOOLBAR_TITLE, toolbarTitle);
        bundle.putString(EXTRA_THEME, theme.name());
        bundle.putInt(EXTRA_PRIMARY_COLOR, primaryColor);

        return bundle;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public void setPrimaryColor(int primaryColor) {
        this.primaryColor = primaryColor;
    }

    public void setToolbarTitle(String title) {
        this.toolbarTitle = title;
    }
}