/*
 * Copyright (C) 2015 hops.io.
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
package io.hops.metadata.hdfs.entity;

public class ProvenanceLogEntry {

  private final int inodeId;
  private final int userId;
  private final int appId;
  private final int logicalTime;
  private final String projectName;
  private final String datasetName;
  private final String userName;
  private final Operation operation;

  public enum Operation {
    READ
  }

  public ProvenanceLogEntry(int inodeId, int userId, int appId, int logicalTime,
    String projectName, String datasetName, String userName, Operation operation) {
    this.inodeId = inodeId;
    this.userId = userId;
    this.appId = appId;
    this.logicalTime = logicalTime;
    this.projectName = projectName;
    this.datasetName = datasetName;
    this.userName = userName;
    this.operation = operation;
  }
  
  public int getInodeId() {
    return inodeId;
  }

  public int getUserId() {
    return userId;
  }

  public int getAppId() {
    return appId;
  }

  public int getLogicalTime() {
    return logicalTime;
  }

  public String getProjectName() {
    return projectName;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public String getUserName() {
    return userName;
  }
  
  public Operation getOperation() {
    return operation;
  }
  
  public short getOperationOrdinal() {
    return (short) operation.ordinal();
  }

  @Override
  public String toString() {
    return "ProvenanceLogEntry{"
      + "inodeId=" + inodeId
      + ", userId=" + userId
      + ", appId=" + appId
      + ", logicalTime=" + logicalTime
      + ", projectName=" + projectName
      + ", datasetName=" + datasetName
      + ", userName=" + userName
      + ", operation=" + operation
      + '}';
  }
}
