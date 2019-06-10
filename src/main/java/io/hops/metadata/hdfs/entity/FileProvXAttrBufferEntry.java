/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.hdfs.entity;

import com.google.common.base.Charsets;

public final class FileProvXAttrBufferEntry {

  private final long iNodeId;
  private final byte namespace;
  private final String name;
  private final int iNodeLogicalTime;
  private final String value;

  public FileProvXAttrBufferEntry(long iNodeId, byte namespace, String name, int iNodeLogicalTime, String value) {
    this.iNodeId = iNodeId;
    this.namespace = namespace;
    this.name = name;
    this.iNodeLogicalTime = iNodeLogicalTime;
    this.value = value;
  }

  public FileProvXAttrBufferEntry(long inodeId, byte namespace, String name, int inodeLogicalTime, byte[] value) {
    this(inodeId, namespace, name, inodeLogicalTime, getXAttrString(value));
  }

  public long getInodeId() {
    return iNodeId;
  }

  public byte getNamespace() {
    return namespace;
  }

  public String getName() {
    return name;
  }

  public int getINodeLogicalTime() {
    return iNodeLogicalTime;
  }

  public String getValue() {
    return value;
  }

  public byte[] getValueBytes() {
    return getXAttrBytes(value);
  }

  public final static byte[] getXAttrBytes(String val) {
    if (val == null) {
      return null;
    }
    return val.getBytes(Charsets.UTF_8);
  }

  public final static String getXAttrString(byte[] val) {
    if (val == null) {
      return new String("");
    }
    return new String(val, Charsets.UTF_8);
  }

  @Override
  public String toString() {
    return "FileProvXAttrBufferEntry{"
      + "iNodeId='" + iNodeId + '\''
      + ", namespace='" + namespace + '\''
      + ", name='" + name + '\''
      + ", inodeLogicalTime='" + iNodeLogicalTime + '\''
      + ", value='" + value + '\'' 
      + '}';
  }
}
