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
  private final String appId;
  private final int logicalTime;
  private final int logicalTimeBatch;
  private final long timestamp;
  private final long timestampBatch;
  private final int parentId;
  private final int partitionId;
  private final String projectName;
  private final String datasetName;
  private final String inodeName;
  private final String userName;
  private final Operation operation;

  public enum Operation {
    CREATE, READ, APPEND, DELETE, METADATA, OTHER
  }

  public ProvenanceLogEntry(int inodeId, int userId, String appId,
    int logicalTime, int logicalTimeBatch, long timestamp, long timestampBatch,
    int parentId, int partitionId, String projectName, String datasetName, 
    String inodeName, String userName, Operation operation) {
    this.inodeId = inodeId;
    this.userId = userId;
    this.appId = appId;
    this.logicalTime = logicalTime;
    this.logicalTimeBatch = logicalTimeBatch;
    this.timestamp = timestamp;
    this.timestampBatch = timestampBatch;
    this.parentId = parentId;
    this.partitionId = parentId;
    this.projectName = projectName;
    this.datasetName = datasetName;
    this.inodeName = inodeName;
    this.userName = userName;
    this.operation = operation;
  }

  public int getInodeId() {
    return inodeId;
  }

  public int getUserId() {
    return userId;
  }

  public String getAppId() {
    return appId;
  }

  public int getLogicalTime() {
    return logicalTime;
  }

  public int getLogicalTimeBatch() {
    return logicalTimeBatch;
  }

  public long getTimestamp() {
    return timestamp;
  }

  public long getTimestampBatch() {
    return timestampBatch;
  }

  public int getParentId() {
    return parentId;
  }

  public int getPartitionId() {
    return partitionId;
  }

  public String getProjectName() {
    return projectName;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public String getInodeName() {
    return inodeName;
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
      + ", logicalTimeBatch=" + logicalTimeBatch
      + ", timestamp=" + timestamp
      + ", timestampBatch=" + timestampBatch
      + ", parentId=" + parentId
      + ", partitionId=" + partitionId
      + ", projectName=" + projectName
      + ", datasetName=" + datasetName
      + ", inodeName=" + inodeName
      + ", userName=" + userName
      + ", operation=" + operation
      + '}';
  }
}
