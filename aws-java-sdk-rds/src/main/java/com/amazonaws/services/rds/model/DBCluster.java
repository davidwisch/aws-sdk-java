/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateDBCluster</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteDBCluster</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>FailoverDBCluster</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ModifyDBCluster</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RestoreDBClusterFromSnapshot</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RestoreDBClusterToPointInTime</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * This data type is used as a response element in the <a>DescribeDBClusters</a>
 * action.
 * </p>
 */
public class DBCluster implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the allocated storage size in gigabytes (GB).
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     */
    private String dBClusterParameterGroup;
    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     */
    private String dBSubnetGroup;
    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     */
    private String percentProgress;
    /**
     * <p>
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     */
    private java.util.Date earliestRestorableTime;
    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     */
    private String engine;
    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     */
    private java.util.Date latestRestorableTime;
    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     */
    private String masterUsername;
    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships;
    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * Read Replica.
     * </p>
     */
    private String replicationSourceIdentifier;
    /**
     * <p>
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> readReplicaIdentifiers;
    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBClusterMember> dBClusterMembers;
    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership> vpcSecurityGroups;
    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for the
     * encrypted DB cluster.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     * </p>
     */
    private String dbClusterResourceId;

    /**
     * <p>
     * Specifies the allocated storage size in gigabytes (GB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gigabytes (GB).
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gigabytes (GB).
     * </p>
     * 
     * @return Specifies the allocated storage size in gigabytes (GB).
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gigabytes (GB).
     * </p>
     * 
     * @param allocatedStorage
     *        Specifies the allocated storage size in gigabytes (GB).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     * </p>
     * 
     * @return Provides the list of EC2 Availability Zones that instances in the
     *         DB cluster can be created in.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of EC2 Availability Zones that instances in the
     *        DB cluster can be created in.
     */

    public void setAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(
                availabilityZones);
    }

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of EC2 Availability Zones that instances in the
     *        DB cluster can be created in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withAvailabilityZones(String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(
                    availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of EC2 Availability Zones that instances in the DB
     * cluster can be created in.
     * </p>
     * 
     * @param availabilityZones
     *        Provides the list of EC2 Availability Zones that instances in the
     *        DB cluster can be created in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the number of days for which automatic DB snapshots are
     *        retained.
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     * 
     * @return Specifies the number of days for which automatic DB snapshots are
     *         retained.
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the number of days for which automatic DB snapshots are
     * retained.
     * </p>
     * 
     * @param backupRetentionPeriod
     *        Specifies the number of days for which automatic DB snapshots are
     *        retained.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     * 
     * @param characterSetName
     *        If present, specifies the name of the character set that this
     *        cluster is associated with.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     * 
     * @return If present, specifies the name of the character set that this
     *         cluster is associated with.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * If present, specifies the name of the character set that this cluster is
     * associated with.
     * </p>
     * 
     * @param characterSetName
     *        If present, specifies the name of the character set that this
     *        cluster is associated with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     * 
     * @param databaseName
     *        Contains the name of the initial database of this DB cluster that
     *        was provided at create time, if one was specified when the DB
     *        cluster was created. This same name is returned for the life of
     *        the DB cluster.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     * 
     * @return Contains the name of the initial database of this DB cluster that
     *         was provided at create time, if one was specified when the DB
     *         cluster was created. This same name is returned for the life of
     *         the DB cluster.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Contains the name of the initial database of this DB cluster that was
     * provided at create time, if one was specified when the DB cluster was
     * created. This same name is returned for the life of the DB cluster.
     * </p>
     * 
     * @param databaseName
     *        Contains the name of the initial database of this DB cluster that
     *        was provided at create time, if one was specified when the DB
     *        cluster was created. This same name is returned for the life of
     *        the DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains a user-supplied DB cluster identifier. This identifier is
     *        the unique key that identifies a DB cluster.
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     * 
     * @return Contains a user-supplied DB cluster identifier. This identifier
     *         is the unique key that identifies a DB cluster.
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * Contains a user-supplied DB cluster identifier. This identifier is the
     * unique key that identifies a DB cluster.
     * </p>
     * 
     * @param dBClusterIdentifier
     *        Contains a user-supplied DB cluster identifier. This identifier is
     *        the unique key that identifies a DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroup
     *        Specifies the name of the DB cluster parameter group for the DB
     *        cluster.
     */

    public void setDBClusterParameterGroup(String dBClusterParameterGroup) {
        this.dBClusterParameterGroup = dBClusterParameterGroup;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @return Specifies the name of the DB cluster parameter group for the DB
     *         cluster.
     */

    public String getDBClusterParameterGroup() {
        return this.dBClusterParameterGroup;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster parameter group for the DB cluster.
     * </p>
     * 
     * @param dBClusterParameterGroup
     *        Specifies the name of the DB cluster parameter group for the DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDBClusterParameterGroup(String dBClusterParameterGroup) {
        setDBClusterParameterGroup(dBClusterParameterGroup);
        return this;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group associated with the DB
     *        cluster, including the name, description, and subnets in the
     *        subnet group.
     */

    public void setDBSubnetGroup(String dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     * 
     * @return Specifies information on the subnet group associated with the DB
     *         cluster, including the name, description, and subnets in the
     *         subnet group.
     */

    public String getDBSubnetGroup() {
        return this.dBSubnetGroup;
    }

    /**
     * <p>
     * Specifies information on the subnet group associated with the DB cluster,
     * including the name, description, and subnets in the subnet group.
     * </p>
     * 
     * @param dBSubnetGroup
     *        Specifies information on the subnet group associated with the DB
     *        cluster, including the name, description, and subnets in the
     *        subnet group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDBSubnetGroup(String dBSubnetGroup) {
        setDBSubnetGroup(dBSubnetGroup);
        return this;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     * 
     * @param status
     *        Specifies the current state of this DB cluster.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     * 
     * @return Specifies the current state of this DB cluster.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the current state of this DB cluster.
     * </p>
     * 
     * @param status
     *        Specifies the current state of this DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the progress of the operation as a percentage.
     */

    public void setPercentProgress(String percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     * 
     * @return Specifies the progress of the operation as a percentage.
     */

    public String getPercentProgress() {
        return this.percentProgress;
    }

    /**
     * <p>
     * Specifies the progress of the operation as a percentage.
     * </p>
     * 
     * @param percentProgress
     *        Specifies the progress of the operation as a percentage.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withPercentProgress(String percentProgress) {
        setPercentProgress(percentProgress);
        return this;
    }

    /**
     * <p>
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     * 
     * @param earliestRestorableTime
     *        Specifies the earliest time to which a database can be restored
     *        with point-in-time restore.
     */

    public void setEarliestRestorableTime(java.util.Date earliestRestorableTime) {
        this.earliestRestorableTime = earliestRestorableTime;
    }

    /**
     * <p>
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     * 
     * @return Specifies the earliest time to which a database can be restored
     *         with point-in-time restore.
     */

    public java.util.Date getEarliestRestorableTime() {
        return this.earliestRestorableTime;
    }

    /**
     * <p>
     * Specifies the earliest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     * 
     * @param earliestRestorableTime
     *        Specifies the earliest time to which a database can be restored
     *        with point-in-time restore.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withEarliestRestorableTime(
            java.util.Date earliestRestorableTime) {
        setEarliestRestorableTime(earliestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint for the primary instance of the
     *        DB cluster.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     * 
     * @return Specifies the connection endpoint for the primary instance of the
     *         DB cluster.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Specifies the connection endpoint for the primary instance of the DB
     * cluster.
     * </p>
     * 
     * @param endpoint
     *        Specifies the connection endpoint for the primary instance of the
     *        DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to be used for this DB
     *        cluster.
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @return Provides the name of the database engine to be used for this DB
     *         cluster.
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * Provides the name of the database engine to be used for this DB cluster.
     * </p>
     * 
     * @param engine
     *        Provides the name of the database engine to be used for this DB
     *        cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @return Indicates the database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     * 
     * @param engineVersion
     *        Indicates the database engine version.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with
     *        point-in-time restore.
     */

    public void setLatestRestorableTime(java.util.Date latestRestorableTime) {
        this.latestRestorableTime = latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     * 
     * @return Specifies the latest time to which a database can be restored
     *         with point-in-time restore.
     */

    public java.util.Date getLatestRestorableTime() {
        return this.latestRestorableTime;
    }

    /**
     * <p>
     * Specifies the latest time to which a database can be restored with
     * point-in-time restore.
     * </p>
     * 
     * @param latestRestorableTime
     *        Specifies the latest time to which a database can be restored with
     *        point-in-time restore.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withLatestRestorableTime(
            java.util.Date latestRestorableTime) {
        setLatestRestorableTime(latestRestorableTime);
        return this;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database engine is listening on.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * 
     * @return Specifies the port that the database engine is listening on.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * 
     * @param port
     *        Specifies the port that the database engine is listening on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        Contains the master username for the DB cluster.
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     * 
     * @return Contains the master username for the DB cluster.
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * Contains the master username for the DB cluster.
     * </p>
     * 
     * @param masterUsername
     *        Contains the master username for the DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * 
     * @return Provides the list of option group memberships for this DB
     *         cluster.
     */

    public java.util.List<DBClusterOptionGroupStatus> getDBClusterOptionGroupMemberships() {
        if (dBClusterOptionGroupMemberships == null) {
            dBClusterOptionGroupMemberships = new com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus>();
        }
        return dBClusterOptionGroupMemberships;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * 
     * @param dBClusterOptionGroupMemberships
     *        Provides the list of option group memberships for this DB cluster.
     */

    public void setDBClusterOptionGroupMemberships(
            java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        if (dBClusterOptionGroupMemberships == null) {
            this.dBClusterOptionGroupMemberships = null;
            return;
        }

        this.dBClusterOptionGroupMemberships = new com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus>(
                dBClusterOptionGroupMemberships);
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use
     * {@link #setDBClusterOptionGroupMemberships(java.util.Collection)} or
     * {@link #withDBClusterOptionGroupMemberships(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBClusterOptionGroupMemberships
     *        Provides the list of option group memberships for this DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDBClusterOptionGroupMemberships(
            DBClusterOptionGroupStatus... dBClusterOptionGroupMemberships) {
        if (this.dBClusterOptionGroupMemberships == null) {
            setDBClusterOptionGroupMemberships(new com.amazonaws.internal.SdkInternalList<DBClusterOptionGroupStatus>(
                    dBClusterOptionGroupMemberships.length));
        }
        for (DBClusterOptionGroupStatus ele : dBClusterOptionGroupMemberships) {
            this.dBClusterOptionGroupMemberships.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of option group memberships for this DB cluster.
     * </p>
     * 
     * @param dBClusterOptionGroupMemberships
     *        Provides the list of option group memberships for this DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDBClusterOptionGroupMemberships(
            java.util.Collection<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships) {
        setDBClusterOptionGroupMemberships(dBClusterOptionGroupMemberships);
        return this;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        Specifies the daily time range during which automated backups are
     *        created if automated backups are enabled, as determined by the
     *        <code>BackupRetentionPeriod</code>.
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @return Specifies the daily time range during which automated backups are
     *         created if automated backups are enabled, as determined by the
     *         <code>BackupRetentionPeriod</code>.
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * Specifies the daily time range during which automated backups are created
     * if automated backups are enabled, as determined by the
     * <code>BackupRetentionPeriod</code>.
     * </p>
     * 
     * @param preferredBackupWindow
     *        Specifies the daily time range during which automated backups are
     *        created if automated backups are enabled, as determined by the
     *        <code>BackupRetentionPeriod</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which system maintenance
     *        can occur, in Universal Coordinated Time (UTC).
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the weekly time range during which system maintenance
     *         can occur, in Universal Coordinated Time (UTC).
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * Specifies the weekly time range during which system maintenance can
     * occur, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        Specifies the weekly time range during which system maintenance
     *        can occur, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withPreferredMaintenanceWindow(
            String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * Read Replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        Contains the identifier of the source DB cluster if this DB
     *        cluster is a Read Replica.
     */

    public void setReplicationSourceIdentifier(
            String replicationSourceIdentifier) {
        this.replicationSourceIdentifier = replicationSourceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * Read Replica.
     * </p>
     * 
     * @return Contains the identifier of the source DB cluster if this DB
     *         cluster is a Read Replica.
     */

    public String getReplicationSourceIdentifier() {
        return this.replicationSourceIdentifier;
    }

    /**
     * <p>
     * Contains the identifier of the source DB cluster if this DB cluster is a
     * Read Replica.
     * </p>
     * 
     * @param replicationSourceIdentifier
     *        Contains the identifier of the source DB cluster if this DB
     *        cluster is a Read Replica.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withReplicationSourceIdentifier(
            String replicationSourceIdentifier) {
        setReplicationSourceIdentifier(replicationSourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB cluster.
     * </p>
     * 
     * @return Contains one or more identifiers of the Read Replicas associated
     *         with this DB cluster.
     */

    public java.util.List<String> getReadReplicaIdentifiers() {
        if (readReplicaIdentifiers == null) {
            readReplicaIdentifiers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return readReplicaIdentifiers;
    }

    /**
     * <p>
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB cluster.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        Contains one or more identifiers of the Read Replicas associated
     *        with this DB cluster.
     */

    public void setReadReplicaIdentifiers(
            java.util.Collection<String> readReplicaIdentifiers) {
        if (readReplicaIdentifiers == null) {
            this.readReplicaIdentifiers = null;
            return;
        }

        this.readReplicaIdentifiers = new com.amazonaws.internal.SdkInternalList<String>(
                readReplicaIdentifiers);
    }

    /**
     * <p>
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setReadReplicaIdentifiers(java.util.Collection)} or
     * {@link #withReadReplicaIdentifiers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        Contains one or more identifiers of the Read Replicas associated
     *        with this DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withReadReplicaIdentifiers(
            String... readReplicaIdentifiers) {
        if (this.readReplicaIdentifiers == null) {
            setReadReplicaIdentifiers(new com.amazonaws.internal.SdkInternalList<String>(
                    readReplicaIdentifiers.length));
        }
        for (String ele : readReplicaIdentifiers) {
            this.readReplicaIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains one or more identifiers of the Read Replicas associated with
     * this DB cluster.
     * </p>
     * 
     * @param readReplicaIdentifiers
     *        Contains one or more identifiers of the Read Replicas associated
     *        with this DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withReadReplicaIdentifiers(
            java.util.Collection<String> readReplicaIdentifiers) {
        setReadReplicaIdentifiers(readReplicaIdentifiers);
        return this;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * 
     * @return Provides the list of instances that make up the DB cluster.
     */

    public java.util.List<DBClusterMember> getDBClusterMembers() {
        if (dBClusterMembers == null) {
            dBClusterMembers = new com.amazonaws.internal.SdkInternalList<DBClusterMember>();
        }
        return dBClusterMembers;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * 
     * @param dBClusterMembers
     *        Provides the list of instances that make up the DB cluster.
     */

    public void setDBClusterMembers(
            java.util.Collection<DBClusterMember> dBClusterMembers) {
        if (dBClusterMembers == null) {
            this.dBClusterMembers = null;
            return;
        }

        this.dBClusterMembers = new com.amazonaws.internal.SdkInternalList<DBClusterMember>(
                dBClusterMembers);
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDBClusterMembers(java.util.Collection)} or
     * {@link #withDBClusterMembers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dBClusterMembers
     *        Provides the list of instances that make up the DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDBClusterMembers(DBClusterMember... dBClusterMembers) {
        if (this.dBClusterMembers == null) {
            setDBClusterMembers(new com.amazonaws.internal.SdkInternalList<DBClusterMember>(
                    dBClusterMembers.length));
        }
        for (DBClusterMember ele : dBClusterMembers) {
            this.dBClusterMembers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides the list of instances that make up the DB cluster.
     * </p>
     * 
     * @param dBClusterMembers
     *        Provides the list of instances that make up the DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDBClusterMembers(
            java.util.Collection<DBClusterMember> dBClusterMembers) {
        setDBClusterMembers(dBClusterMembers);
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @return Provides a list of VPC security groups that the DB cluster
     *         belongs to.
     */

    public java.util.List<VpcSecurityGroupMembership> getVpcSecurityGroups() {
        if (vpcSecurityGroups == null) {
            vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>();
        }
        return vpcSecurityGroups;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security groups that the DB cluster belongs
     *        to.
     */

    public void setVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        if (vpcSecurityGroups == null) {
            this.vpcSecurityGroups = null;
            return;
        }

        this.vpcSecurityGroups = new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(
                vpcSecurityGroups);
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcSecurityGroups(java.util.Collection)} or
     * {@link #withVpcSecurityGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security groups that the DB cluster belongs
     *        to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withVpcSecurityGroups(
            VpcSecurityGroupMembership... vpcSecurityGroups) {
        if (this.vpcSecurityGroups == null) {
            setVpcSecurityGroups(new com.amazonaws.internal.SdkInternalList<VpcSecurityGroupMembership>(
                    vpcSecurityGroups.length));
        }
        for (VpcSecurityGroupMembership ele : vpcSecurityGroups) {
            this.vpcSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Provides a list of VPC security groups that the DB cluster belongs to.
     * </p>
     * 
     * @param vpcSecurityGroups
     *        Provides a list of VPC security groups that the DB cluster belongs
     *        to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withVpcSecurityGroups(
            java.util.Collection<VpcSecurityGroupMembership> vpcSecurityGroups) {
        setVpcSecurityGroups(vpcSecurityGroups);
        return this;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * 
     * @param hostedZoneId
     *        Specifies the ID that Amazon Route 53 assigns when you create a
     *        hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * 
     * @return Specifies the ID that Amazon Route 53 assigns when you create a
     *         hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * 
     * @param hostedZoneId
     *        Specifies the ID that Amazon Route 53 assigns when you create a
     *        hosted zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster is encrypted.
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster is encrypted.
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB cluster is encrypted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster is encrypted.
     * </p>
     * 
     * @return Specifies whether the DB cluster is encrypted.
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for the
     * encrypted DB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the KMS key identifier
     *        for the encrypted DB cluster.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for the
     * encrypted DB cluster.
     * </p>
     * 
     * @return If <code>StorageEncrypted</code> is true, the KMS key identifier
     *         for the encrypted DB cluster.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the KMS key identifier for the
     * encrypted DB cluster.
     * </p>
     * 
     * @param kmsKeyId
     *        If <code>StorageEncrypted</code> is true, the KMS key identifier
     *        for the encrypted DB cluster.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The region-unique, immutable identifier for the DB cluster. This
     *        identifier is found in AWS CloudTrail log entries whenever the KMS
     *        key for the DB cluster is accessed.
     */

    public void setDbClusterResourceId(String dbClusterResourceId) {
        this.dbClusterResourceId = dbClusterResourceId;
    }

    /**
     * <p>
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     * </p>
     * 
     * @return The region-unique, immutable identifier for the DB cluster. This
     *         identifier is found in AWS CloudTrail log entries whenever the
     *         KMS key for the DB cluster is accessed.
     */

    public String getDbClusterResourceId() {
        return this.dbClusterResourceId;
    }

    /**
     * <p>
     * The region-unique, immutable identifier for the DB cluster. This
     * identifier is found in AWS CloudTrail log entries whenever the KMS key
     * for the DB cluster is accessed.
     * </p>
     * 
     * @param dbClusterResourceId
     *        The region-unique, immutable identifier for the DB cluster. This
     *        identifier is found in AWS CloudTrail log entries whenever the KMS
     *        key for the DB cluster is accessed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DBCluster withDbClusterResourceId(String dbClusterResourceId) {
        setDbClusterResourceId(dbClusterResourceId);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod()
                    + ",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: " + getDatabaseName() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getDBClusterParameterGroup() != null)
            sb.append("DBClusterParameterGroup: "
                    + getDBClusterParameterGroup() + ",");
        if (getDBSubnetGroup() != null)
            sb.append("DBSubnetGroup: " + getDBSubnetGroup() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (getEarliestRestorableTime() != null)
            sb.append("EarliestRestorableTime: " + getEarliestRestorableTime()
                    + ",");
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLatestRestorableTime() != null)
            sb.append("LatestRestorableTime: " + getLatestRestorableTime()
                    + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getDBClusterOptionGroupMemberships() != null)
            sb.append("DBClusterOptionGroupMemberships: "
                    + getDBClusterOptionGroupMemberships() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow()
                    + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: "
                    + getPreferredMaintenanceWindow() + ",");
        if (getReplicationSourceIdentifier() != null)
            sb.append("ReplicationSourceIdentifier: "
                    + getReplicationSourceIdentifier() + ",");
        if (getReadReplicaIdentifiers() != null)
            sb.append("ReadReplicaIdentifiers: " + getReadReplicaIdentifiers()
                    + ",");
        if (getDBClusterMembers() != null)
            sb.append("DBClusterMembers: " + getDBClusterMembers() + ",");
        if (getVpcSecurityGroups() != null)
            sb.append("VpcSecurityGroups: " + getVpcSecurityGroups() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDbClusterResourceId() != null)
            sb.append("DbClusterResourceId: " + getDbClusterResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBCluster == false)
            return false;
        DBCluster other = (DBCluster) obj;
        if (other.getAllocatedStorage() == null
                ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(
                        this.getAllocatedStorage()) == false)
            return false;
        if (other.getAvailabilityZones() == null
                ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(
                        this.getAvailabilityZones()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null
                ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(
                        this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getCharacterSetName() == null
                ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null
                && other.getCharacterSetName().equals(
                        this.getCharacterSetName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null
                ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(
                        this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getDBClusterParameterGroup() == null
                ^ this.getDBClusterParameterGroup() == null)
            return false;
        if (other.getDBClusterParameterGroup() != null
                && other.getDBClusterParameterGroup().equals(
                        this.getDBClusterParameterGroup()) == false)
            return false;
        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null)
            return false;
        if (other.getDBSubnetGroup() != null
                && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPercentProgress() == null
                ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null
                && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getEarliestRestorableTime() == null
                ^ this.getEarliestRestorableTime() == null)
            return false;
        if (other.getEarliestRestorableTime() != null
                && other.getEarliestRestorableTime().equals(
                        this.getEarliestRestorableTime()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null
                && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null
                && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getLatestRestorableTime() == null
                ^ this.getLatestRestorableTime() == null)
            return false;
        if (other.getLatestRestorableTime() != null
                && other.getLatestRestorableTime().equals(
                        this.getLatestRestorableTime()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null
                && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMasterUsername() == null
                ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getDBClusterOptionGroupMemberships() == null
                ^ this.getDBClusterOptionGroupMemberships() == null)
            return false;
        if (other.getDBClusterOptionGroupMemberships() != null
                && other.getDBClusterOptionGroupMemberships().equals(
                        this.getDBClusterOptionGroupMemberships()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null
                ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null
                && other.getPreferredBackupWindow().equals(
                        this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null
                ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null
                && other.getPreferredMaintenanceWindow().equals(
                        this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getReplicationSourceIdentifier() == null
                ^ this.getReplicationSourceIdentifier() == null)
            return false;
        if (other.getReplicationSourceIdentifier() != null
                && other.getReplicationSourceIdentifier().equals(
                        this.getReplicationSourceIdentifier()) == false)
            return false;
        if (other.getReadReplicaIdentifiers() == null
                ^ this.getReadReplicaIdentifiers() == null)
            return false;
        if (other.getReadReplicaIdentifiers() != null
                && other.getReadReplicaIdentifiers().equals(
                        this.getReadReplicaIdentifiers()) == false)
            return false;
        if (other.getDBClusterMembers() == null
                ^ this.getDBClusterMembers() == null)
            return false;
        if (other.getDBClusterMembers() != null
                && other.getDBClusterMembers().equals(
                        this.getDBClusterMembers()) == false)
            return false;
        if (other.getVpcSecurityGroups() == null
                ^ this.getVpcSecurityGroups() == null)
            return false;
        if (other.getVpcSecurityGroups() != null
                && other.getVpcSecurityGroups().equals(
                        this.getVpcSecurityGroups()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getStorageEncrypted() == null
                ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null
                && other.getStorageEncrypted().equals(
                        this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null
                && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDbClusterResourceId() == null
                ^ this.getDbClusterResourceId() == null)
            return false;
        if (other.getDbClusterResourceId() != null
                && other.getDbClusterResourceId().equals(
                        this.getDbClusterResourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailabilityZones() == null) ? 0
                        : getAvailabilityZones().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0
                        : getBackupRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getCharacterSetName() == null) ? 0 : getCharacterSetName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterIdentifier() == null) ? 0
                        : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroup() == null) ? 0
                        : getDBClusterParameterGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getPercentProgress() == null) ? 0 : getPercentProgress()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEarliestRestorableTime() == null) ? 0
                        : getEarliestRestorableTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime
                * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLatestRestorableTime() == null) ? 0
                        : getLatestRestorableTime().hashCode());
        hashCode = prime * hashCode
                + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterOptionGroupMemberships() == null) ? 0
                        : getDBClusterOptionGroupMemberships().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredBackupWindow() == null) ? 0
                        : getPreferredBackupWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getPreferredMaintenanceWindow() == null) ? 0
                        : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getReplicationSourceIdentifier() == null) ? 0
                        : getReplicationSourceIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getReadReplicaIdentifiers() == null) ? 0
                        : getReadReplicaIdentifiers().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterMembers() == null) ? 0 : getDBClusterMembers()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVpcSecurityGroups() == null) ? 0
                        : getVpcSecurityGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDbClusterResourceId() == null) ? 0
                        : getDbClusterResourceId().hashCode());
        return hashCode;
    }

    @Override
    public DBCluster clone() {
        try {
            return (DBCluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
