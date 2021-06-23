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
// source: google/cloud/eventarc/v1/trigger.proto

package com.google.cloud.eventarc.v1;

/**
 *
 *
 * <pre>
 * Represents the transport intermediaries created for the trigger in order to
 * deliver events.
 * </pre>
 *
 * Protobuf type {@code google.cloud.eventarc.v1.Transport}
 */
public final class Transport extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.eventarc.v1.Transport)
    TransportOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Transport.newBuilder() to construct.
  private Transport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Transport() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Transport();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Transport(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.eventarc.v1.Pubsub.Builder subBuilder = null;
              if (intermediaryCase_ == 1) {
                subBuilder = ((com.google.cloud.eventarc.v1.Pubsub) intermediary_).toBuilder();
              }
              intermediary_ =
                  input.readMessage(
                      com.google.cloud.eventarc.v1.Pubsub.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.eventarc.v1.Pubsub) intermediary_);
                intermediary_ = subBuilder.buildPartial();
              }
              intermediaryCase_ = 1;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.eventarc.v1.TriggerProto
        .internal_static_google_cloud_eventarc_v1_Transport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.eventarc.v1.TriggerProto
        .internal_static_google_cloud_eventarc_v1_Transport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.eventarc.v1.Transport.class,
            com.google.cloud.eventarc.v1.Transport.Builder.class);
  }

  private int intermediaryCase_ = 0;
  private java.lang.Object intermediary_;

  public enum IntermediaryCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PUBSUB(1),
    INTERMEDIARY_NOT_SET(0);
    private final int value;

    private IntermediaryCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static IntermediaryCase valueOf(int value) {
      return forNumber(value);
    }

    public static IntermediaryCase forNumber(int value) {
      switch (value) {
        case 1:
          return PUBSUB;
        case 0:
          return INTERMEDIARY_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public IntermediaryCase getIntermediaryCase() {
    return IntermediaryCase.forNumber(intermediaryCase_);
  }

  public static final int PUBSUB_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The Pub/Sub topic and subscription used by Eventarc as delivery
   * intermediary.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
   *
   * @return Whether the pubsub field is set.
   */
  @java.lang.Override
  public boolean hasPubsub() {
    return intermediaryCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The Pub/Sub topic and subscription used by Eventarc as delivery
   * intermediary.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
   *
   * @return The pubsub.
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.Pubsub getPubsub() {
    if (intermediaryCase_ == 1) {
      return (com.google.cloud.eventarc.v1.Pubsub) intermediary_;
    }
    return com.google.cloud.eventarc.v1.Pubsub.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The Pub/Sub topic and subscription used by Eventarc as delivery
   * intermediary.
   * </pre>
   *
   * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.eventarc.v1.PubsubOrBuilder getPubsubOrBuilder() {
    if (intermediaryCase_ == 1) {
      return (com.google.cloud.eventarc.v1.Pubsub) intermediary_;
    }
    return com.google.cloud.eventarc.v1.Pubsub.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (intermediaryCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.eventarc.v1.Pubsub) intermediary_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (intermediaryCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.eventarc.v1.Pubsub) intermediary_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.eventarc.v1.Transport)) {
      return super.equals(obj);
    }
    com.google.cloud.eventarc.v1.Transport other = (com.google.cloud.eventarc.v1.Transport) obj;

    if (!getIntermediaryCase().equals(other.getIntermediaryCase())) return false;
    switch (intermediaryCase_) {
      case 1:
        if (!getPubsub().equals(other.getPubsub())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (intermediaryCase_) {
      case 1:
        hash = (37 * hash) + PUBSUB_FIELD_NUMBER;
        hash = (53 * hash) + getPubsub().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.Transport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.Transport parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.eventarc.v1.Transport parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.eventarc.v1.Transport prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Represents the transport intermediaries created for the trigger in order to
   * deliver events.
   * </pre>
   *
   * Protobuf type {@code google.cloud.eventarc.v1.Transport}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.eventarc.v1.Transport)
      com.google.cloud.eventarc.v1.TransportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_Transport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_Transport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.eventarc.v1.Transport.class,
              com.google.cloud.eventarc.v1.Transport.Builder.class);
    }

    // Construct using com.google.cloud.eventarc.v1.Transport.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      intermediaryCase_ = 0;
      intermediary_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.eventarc.v1.TriggerProto
          .internal_static_google_cloud_eventarc_v1_Transport_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.Transport getDefaultInstanceForType() {
      return com.google.cloud.eventarc.v1.Transport.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.Transport build() {
      com.google.cloud.eventarc.v1.Transport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.eventarc.v1.Transport buildPartial() {
      com.google.cloud.eventarc.v1.Transport result =
          new com.google.cloud.eventarc.v1.Transport(this);
      if (intermediaryCase_ == 1) {
        if (pubsubBuilder_ == null) {
          result.intermediary_ = intermediary_;
        } else {
          result.intermediary_ = pubsubBuilder_.build();
        }
      }
      result.intermediaryCase_ = intermediaryCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.eventarc.v1.Transport) {
        return mergeFrom((com.google.cloud.eventarc.v1.Transport) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.eventarc.v1.Transport other) {
      if (other == com.google.cloud.eventarc.v1.Transport.getDefaultInstance()) return this;
      switch (other.getIntermediaryCase()) {
        case PUBSUB:
          {
            mergePubsub(other.getPubsub());
            break;
          }
        case INTERMEDIARY_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.eventarc.v1.Transport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.eventarc.v1.Transport) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int intermediaryCase_ = 0;
    private java.lang.Object intermediary_;

    public IntermediaryCase getIntermediaryCase() {
      return IntermediaryCase.forNumber(intermediaryCase_);
    }

    public Builder clearIntermediary() {
      intermediaryCase_ = 0;
      intermediary_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Pubsub,
            com.google.cloud.eventarc.v1.Pubsub.Builder,
            com.google.cloud.eventarc.v1.PubsubOrBuilder>
        pubsubBuilder_;
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     *
     * @return Whether the pubsub field is set.
     */
    @java.lang.Override
    public boolean hasPubsub() {
      return intermediaryCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     *
     * @return The pubsub.
     */
    @java.lang.Override
    public com.google.cloud.eventarc.v1.Pubsub getPubsub() {
      if (pubsubBuilder_ == null) {
        if (intermediaryCase_ == 1) {
          return (com.google.cloud.eventarc.v1.Pubsub) intermediary_;
        }
        return com.google.cloud.eventarc.v1.Pubsub.getDefaultInstance();
      } else {
        if (intermediaryCase_ == 1) {
          return pubsubBuilder_.getMessage();
        }
        return com.google.cloud.eventarc.v1.Pubsub.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     */
    public Builder setPubsub(com.google.cloud.eventarc.v1.Pubsub value) {
      if (pubsubBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        intermediary_ = value;
        onChanged();
      } else {
        pubsubBuilder_.setMessage(value);
      }
      intermediaryCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     */
    public Builder setPubsub(com.google.cloud.eventarc.v1.Pubsub.Builder builderForValue) {
      if (pubsubBuilder_ == null) {
        intermediary_ = builderForValue.build();
        onChanged();
      } else {
        pubsubBuilder_.setMessage(builderForValue.build());
      }
      intermediaryCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     */
    public Builder mergePubsub(com.google.cloud.eventarc.v1.Pubsub value) {
      if (pubsubBuilder_ == null) {
        if (intermediaryCase_ == 1
            && intermediary_ != com.google.cloud.eventarc.v1.Pubsub.getDefaultInstance()) {
          intermediary_ =
              com.google.cloud.eventarc.v1.Pubsub.newBuilder(
                      (com.google.cloud.eventarc.v1.Pubsub) intermediary_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          intermediary_ = value;
        }
        onChanged();
      } else {
        if (intermediaryCase_ == 1) {
          pubsubBuilder_.mergeFrom(value);
        }
        pubsubBuilder_.setMessage(value);
      }
      intermediaryCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     */
    public Builder clearPubsub() {
      if (pubsubBuilder_ == null) {
        if (intermediaryCase_ == 1) {
          intermediaryCase_ = 0;
          intermediary_ = null;
          onChanged();
        }
      } else {
        if (intermediaryCase_ == 1) {
          intermediaryCase_ = 0;
          intermediary_ = null;
        }
        pubsubBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     */
    public com.google.cloud.eventarc.v1.Pubsub.Builder getPubsubBuilder() {
      return getPubsubFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.eventarc.v1.PubsubOrBuilder getPubsubOrBuilder() {
      if ((intermediaryCase_ == 1) && (pubsubBuilder_ != null)) {
        return pubsubBuilder_.getMessageOrBuilder();
      } else {
        if (intermediaryCase_ == 1) {
          return (com.google.cloud.eventarc.v1.Pubsub) intermediary_;
        }
        return com.google.cloud.eventarc.v1.Pubsub.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The Pub/Sub topic and subscription used by Eventarc as delivery
     * intermediary.
     * </pre>
     *
     * <code>.google.cloud.eventarc.v1.Pubsub pubsub = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.eventarc.v1.Pubsub,
            com.google.cloud.eventarc.v1.Pubsub.Builder,
            com.google.cloud.eventarc.v1.PubsubOrBuilder>
        getPubsubFieldBuilder() {
      if (pubsubBuilder_ == null) {
        if (!(intermediaryCase_ == 1)) {
          intermediary_ = com.google.cloud.eventarc.v1.Pubsub.getDefaultInstance();
        }
        pubsubBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.eventarc.v1.Pubsub,
                com.google.cloud.eventarc.v1.Pubsub.Builder,
                com.google.cloud.eventarc.v1.PubsubOrBuilder>(
                (com.google.cloud.eventarc.v1.Pubsub) intermediary_,
                getParentForChildren(),
                isClean());
        intermediary_ = null;
      }
      intermediaryCase_ = 1;
      onChanged();
      ;
      return pubsubBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.eventarc.v1.Transport)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.eventarc.v1.Transport)
  private static final com.google.cloud.eventarc.v1.Transport DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.eventarc.v1.Transport();
  }

  public static com.google.cloud.eventarc.v1.Transport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Transport> PARSER =
      new com.google.protobuf.AbstractParser<Transport>() {
        @java.lang.Override
        public Transport parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Transport(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Transport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Transport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.eventarc.v1.Transport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}