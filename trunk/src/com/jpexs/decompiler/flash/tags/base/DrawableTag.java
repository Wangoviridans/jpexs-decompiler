/*
 *  Copyright (C) 2010-2014 JPEXS
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
package com.jpexs.decompiler.flash.tags.base;

import com.jpexs.decompiler.flash.exporters.Matrix;
import com.jpexs.decompiler.flash.exporters.Point;
import com.jpexs.decompiler.flash.tags.Tag;
import com.jpexs.decompiler.flash.types.ColorTransform;
import com.jpexs.helpers.SerializableImage;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author JPEXS
 */
public interface DrawableTag {

    public SerializableImage toImage(int frame, int ratio, List<Tag> tags, Map<Integer, CharacterTag> characters, Stack<Integer> visited, Matrix transformation, ColorTransform colorTransform);

    public void toImage(int frame, int ratio, List<Tag> tags, Map<Integer, CharacterTag> characters, Stack<Integer> visited, SerializableImage image, Matrix transformation, ColorTransform colorTransform);

    public Point getImagePos(int frame, Map<Integer, CharacterTag> characters, Stack<Integer> visited);

    public int getNumFrames();
}
