/*
 *  AndiCar - car management software for Android powered devices
 *  Copyright (C) 2010 Miklos Keresztes (miklos.keresztes@gmail.com)
 *  
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT AY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *  
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.andicar.persistence;

import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import org.andicar.activity.R;
import org.andicar.utils.Utils;

/**
 * Copiryght (C) BIT Software S.R.L. (www.bitsoftware.ro)
 * All rights reserved.
 * @author Miklos Keresztes - BIT Software (www.bitsoftware.ro)
 * @product SocrateOpen (www.socrateopen.ro)
 */
public class GPSDataBinder implements SimpleCursorAdapter.ViewBinder {
    @Override
    public boolean setViewValue(View view, Cursor cursor, int columnIndex) {
        try{
            if(columnIndex == cursor.getColumnIndex(ReportDbAdapter.SECOND_LINE_LIST_NAME)) {
                Resources mRes = view.getResources();
                ((TextView) view).setText(cursor.getString(cursor.getColumnIndex(ReportDbAdapter.SECOND_LINE_LIST_NAME))
                        .replace("%1", mRes.getString(R.string.MainActivity_GPSTrackZone_1))
                        .replace("%2", mRes.getString(R.string.MainActivity_GPSTrackZone_2))
                        .replace("%3", mRes.getString(R.string.MainActivity_GPSTrackZone_3))
                        .replace("%4", mRes.getString(R.string.MainActivity_GPSTrackZone_4))
                        .replace("%5", mRes.getString(R.string.MainActivity_GPSTrackZone_5) +
                                Utils.getTimeString(cursor.getLong(cursor.getColumnIndex(ReportDbAdapter.FOURTH_LINE_LIST_NAME)), false))
                        .replace("%6", mRes.getString(R.string.MainActivity_GPSTrackZone_6) +
                                Utils.getTimeString(cursor.getLong(cursor.getColumnIndex(ReportDbAdapter.FIFTH_LINE_LIST_NAME)), false)));
                return true;
            }
        }
        catch(Exception e){
            return false;
        }
        return false;
    }
}
