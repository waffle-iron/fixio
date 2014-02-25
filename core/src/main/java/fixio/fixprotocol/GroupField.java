/*
 * Copyright 2014 The FIX.io Project
 *
 * The FIX.io Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package fixio.fixprotocol;


import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sequence of {@link Group}s prepended with tag of type {@link DataType#NUMINGROUP}.
 */
public class GroupField extends FixMessageFragment {

    private static final int DEFAULT_SIZE = 2;
    private final List<Group> groups;

    protected GroupField(int tagNum, int expectedSize) {
        super(tagNum);
        groups = new ArrayList<>(expectedSize);
    }

    protected GroupField(int tagNum) {
        this(tagNum, DEFAULT_SIZE);
    }

    public void add(Group group) {
        groups.add(group);
    }

    public int getGroupCount() {
        return groups.size();
    }

    public List<Group> getGroups() {
        return groups;
    }
}