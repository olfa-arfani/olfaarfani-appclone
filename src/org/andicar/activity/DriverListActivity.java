/*
 *  AndiCar - a car management software for Android powered devices.
 *
 *  Copyright (C) 2010 Miklos Keresztes (miklos.keresztes@gmail.com)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.andicar.activity;

import android.os.Bundle;
import org.andicar.persistence.MainDbAdapter;

/**
 *
 * @author miki
 */
public class DriverListActivity extends ListActivityBase
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate( Bundle icicle )
    {
        super.onCreate( icicle, null, DriverEditActivity.class, null,
                MainDbAdapter.DRIVER_TABLE_NAME, MainDbAdapter.driverTableColNames, null, MainDbAdapter.GEN_COL_NAME_NAME,
                android.R.layout.simple_list_item_2,
                new String[]{MainDbAdapter.GEN_COL_NAME_NAME}, new int[]{android.R.id.text1}, null);
    }
}
