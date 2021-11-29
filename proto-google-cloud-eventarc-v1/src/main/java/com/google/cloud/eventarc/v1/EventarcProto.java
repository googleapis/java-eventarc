/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

public final class EventarcProto {
  private EventarcProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_GetTriggerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_GetTriggerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_ListTriggersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_ListTriggersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_ListTriggersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_ListTriggersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_UpdateTriggerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_UpdateTriggerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_DeleteTriggerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_DeleteTriggerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_eventarc_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_eventarc_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "\'google/cloud/eventarc/v1/eventarc.prot"
          + "o\022\030google.cloud.eventarc.v1\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\032&google/cloud/eve"
          + "ntarc/v1/trigger.proto\032#google/longrunning/operations.proto\032 google/protobuf/fie"
          + "ld_mask.proto\032\037google/protobuf/timestamp.proto\"J\n"
          + "\021GetTriggerRequest\0225\n"
          + "\004name\030\001 \001(\tB\'\340A\002\372A!\n"
          + "\037eventarc.googleapis.com/Trigger\"\207\001\n"
          + "\023ListTriggersRequest\0227\n"
          + "\006parent\030\001 \001("
          + "\tB\'\340A\002\372A!\022\037eventarc.googleapis.com/Trigger\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\022\020\n"
          + "\010order_by\030\004 \001(\t\"y\n"
          + "\024ListTriggersResponse\0223\n"
          + "\010triggers\030\001 \003(\0132!.google.cloud.eventarc.v1.Trigger\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\"\275\001\n"
          + "\024CreateTriggerRequest\0227\n"
          + "\006parent\030\001 \001("
          + "\tB\'\340A\002\372A!\022\037eventarc.googleapis.com/Trigger\0227\n"
          + "\007trigger\030\002 \001"
          + "(\0132!.google.cloud.eventarc.v1.TriggerB\003\340A\002\022\027\n\n"
          + "trigger_id\030\003 \001(\tB\003\340A\002\022\032\n\r"
          + "validate_only\030\004 \001(\010B\003\340A\002\"\256\001\n"
          + "\024UpdateTriggerRequest\0222\n"
          + "\007trigger\030\001 \001(\0132!.google.cloud.eventarc.v1.Trigger\022/\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMask\022\025\n\r"
          + "allow_missing\030\003 \001(\010\022\032\n\r"
          + "validate_only\030\004 \001(\010B\003\340A\002\"\216\001\n"
          + "\024DeleteTriggerRequest\0225\n"
          + "\004name\030\001 \001(\tB\'\340A\002\372A!\n"
          + "\037eventarc.googleapis.com/Trigger\022\014\n"
          + "\004etag\030\002 \001(\t\022\025\n\r"
          + "allow_missing\030\003 \001(\010\022\032\n\r"
          + "validate_only\030\004 \001(\010B\003\340A\002\"\200\002\n"
          + "\021OperationMetadata\0224\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\004 \001(\tB\003\340A\003\022\033\n"
          + "\016status_message\030\005 \001(\tB\003\340A\003\022#\n"
          + "\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\007 \001(\tB\003\340A\0032\264\010\n"
          + "\010Eventarc\022\231\001\n\n"
          + "GetTrigger\022+.google.cloud.eventarc.v1.GetTriggerRequest\032!.google.c"
          + "loud.eventarc.v1.Trigger\";\202\323\344\223\002.\022,/v1/{n"
          + "ame=projects/*/locations/*/triggers/*}\332A\004name\022\254\001\n"
          + "\014ListTriggers\022-.google.cloud.eventarc.v1.ListTriggersRequest\032..google.c"
          + "loud.eventarc.v1.ListTriggersResponse\"=\202"
          + "\323\344\223\002.\022,/v1/{parent=projects/*/locations/*}/triggers\332A\006parent\022\330\001\n\r"
          + "CreateTrigger\022..google.cloud.eventarc.v1.CreateTriggerR"
          + "equest\032\035.google.longrunning.Operation\"x\202"
          + "\323\344\223\0027\",/v1/{parent=projects/*/locations/"
          + "*}/triggers:\007trigger\332A\031parent,trigger,trigger_id\312A\034\n"
          + "\007Trigger\022\021OperationMetadata\022\351\001\n\r"
          + "UpdateTrigger\022..google.cloud.eventarc.v1.UpdateTriggerRequest\032\035.google.longr"
          + "unning.Operation\"\210\001\202\323\344\223\002?24/v1/{trigger."
          + "name=projects/*/locations/*/triggers/*}:"
          + "\007trigger\332A!trigger,update_mask,allow_missing\312A\034\n"
          + "\007Trigger\022\021OperationMetadata\022\310\001\n\r"
          + "DeleteTrigger\022..google.cloud.eventarc.v1"
          + ".DeleteTriggerRequest\032\035.google.longrunni"
          + "ng.Operation\"h\202\323\344\223\002.*,/v1/{name=projects"
          + "/*/locations/*/triggers/*}\332A\022name,allow_missing\312A\034\n"
          + "\007Trigger\022\021OperationMetadata\032K"
          + "\312A\027eventarc.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformB\305\001\n"
          + "\034com.google.cloud.eventarc.v1B\r"
          + "EventarcProtoP\001Z@google.golang.org/genproto/google"
          + "apis/cloud/eventarc/v1;eventarc\252\002\030Google"
          + ".Cloud.Eventarc.V1\312\002\030Google\\Cloud\\Eventa"
          + "rc\\V1\352\002\033Google::Cloud::Eventarc::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.eventarc.v1.TriggerProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_eventarc_v1_GetTriggerRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_eventarc_v1_GetTriggerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_GetTriggerRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_eventarc_v1_ListTriggersRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_eventarc_v1_ListTriggersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_ListTriggersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_cloud_eventarc_v1_ListTriggersResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_eventarc_v1_ListTriggersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_ListTriggersResponse_descriptor,
            new java.lang.String[] {
              "Triggers", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_CreateTriggerRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Trigger", "TriggerId", "ValidateOnly",
            });
    internal_static_google_cloud_eventarc_v1_UpdateTriggerRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_eventarc_v1_UpdateTriggerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_UpdateTriggerRequest_descriptor,
            new java.lang.String[] {
              "Trigger", "UpdateMask", "AllowMissing", "ValidateOnly",
            });
    internal_static_google_cloud_eventarc_v1_DeleteTriggerRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_eventarc_v1_DeleteTriggerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_DeleteTriggerRequest_descriptor,
            new java.lang.String[] {
              "Name", "Etag", "AllowMissing", "ValidateOnly",
            });
    internal_static_google_cloud_eventarc_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_eventarc_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_eventarc_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.eventarc.v1.TriggerProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
