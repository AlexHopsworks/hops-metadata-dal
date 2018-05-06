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

  private final int projectId;
  private final int datasetId;
  private final int inodeId;
  private final int userId;
  private int logicalTime;
  private final Operation operation;

  public enum Operation {
    READ
  }

  public ProvenanceLogEntry(int projectId, int datasetId, int inodeId, int userId, int logicalTime, Operation operation) {
    this.projectId = projectId;
    this.datasetId = datasetId;
    this.inodeId = inodeId;
    this.userId = userId;
    this.logicalTime = logicalTime;
    this.operation = operation;
  }

  public int getProjectId() {
    return projectId;
  }

  public int getDatasetId() {
    return datasetId;
  }

  public int getInodeId() {
    return inodeId;
  }

  public int getUserId() {
    return userId;
  }

  public int getLogicalTime() {
    return logicalTime;
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
      + "projectId=" + projectId
      + ", datasetId=" + datasetId
      + ", inodeId=" + inodeId
      + ", userId=" + userId
      + ", logicalTime=" + logicalTime
      + ", operation=" + operation
      + '}';
  }
}
