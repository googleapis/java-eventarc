/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.eventarc.v1.stub;

import static com.google.cloud.eventarc.v1.EventarcClient.ListTriggersPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.grpc.ProtoOperationTransformers;
import com.google.api.gax.longrunning.OperationSnapshot;
import com.google.api.gax.longrunning.OperationTimedPollAlgorithm;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiCallContext;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.PagedListDescriptor;
import com.google.api.gax.rpc.PagedListResponseFactory;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.eventarc.v1.CreateTriggerRequest;
import com.google.cloud.eventarc.v1.DeleteTriggerRequest;
import com.google.cloud.eventarc.v1.GetTriggerRequest;
import com.google.cloud.eventarc.v1.ListTriggersRequest;
import com.google.cloud.eventarc.v1.ListTriggersResponse;
import com.google.cloud.eventarc.v1.OperationMetadata;
import com.google.cloud.eventarc.v1.Trigger;
import com.google.cloud.eventarc.v1.UpdateTriggerRequest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;
import org.threeten.bp.Duration;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link EventarcStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (eventarc.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getTrigger to 30 seconds:
 *
 * <pre>{@code
 * EventarcStubSettings.Builder eventarcSettingsBuilder = EventarcStubSettings.newBuilder();
 * eventarcSettingsBuilder
 *     .getTriggerSettings()
 *     .setRetrySettings(
 *         eventarcSettingsBuilder
 *             .getTriggerSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * EventarcStubSettings eventarcSettings = eventarcSettingsBuilder.build();
 * }</pre>
 */
@Generated("by gapic-generator-java")
public class EventarcStubSettings extends StubSettings<EventarcStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder().add("https://www.googleapis.com/auth/cloud-platform").build();

  private final UnaryCallSettings<GetTriggerRequest, Trigger> getTriggerSettings;
  private final PagedCallSettings<
          ListTriggersRequest, ListTriggersResponse, ListTriggersPagedResponse>
      listTriggersSettings;
  private final UnaryCallSettings<CreateTriggerRequest, Operation> createTriggerSettings;
  private final OperationCallSettings<CreateTriggerRequest, Trigger, OperationMetadata>
      createTriggerOperationSettings;
  private final UnaryCallSettings<UpdateTriggerRequest, Operation> updateTriggerSettings;
  private final OperationCallSettings<UpdateTriggerRequest, Trigger, OperationMetadata>
      updateTriggerOperationSettings;
  private final UnaryCallSettings<DeleteTriggerRequest, Operation> deleteTriggerSettings;
  private final OperationCallSettings<DeleteTriggerRequest, Trigger, OperationMetadata>
      deleteTriggerOperationSettings;

  private static final PagedListDescriptor<ListTriggersRequest, ListTriggersResponse, Trigger>
      LIST_TRIGGERS_PAGE_STR_DESC =
          new PagedListDescriptor<ListTriggersRequest, ListTriggersResponse, Trigger>() {
            @Override
            public String emptyToken() {
              return "";
            }

            @Override
            public ListTriggersRequest injectToken(ListTriggersRequest payload, String token) {
              return ListTriggersRequest.newBuilder(payload).setPageToken(token).build();
            }

            @Override
            public ListTriggersRequest injectPageSize(ListTriggersRequest payload, int pageSize) {
              return ListTriggersRequest.newBuilder(payload).setPageSize(pageSize).build();
            }

            @Override
            public Integer extractPageSize(ListTriggersRequest payload) {
              return payload.getPageSize();
            }

            @Override
            public String extractNextToken(ListTriggersResponse payload) {
              return payload.getNextPageToken();
            }

            @Override
            public Iterable<Trigger> extractResources(ListTriggersResponse payload) {
              return payload.getTriggersList() == null
                  ? ImmutableList.<Trigger>of()
                  : payload.getTriggersList();
            }
          };

  private static final PagedListResponseFactory<
          ListTriggersRequest, ListTriggersResponse, ListTriggersPagedResponse>
      LIST_TRIGGERS_PAGE_STR_FACT =
          new PagedListResponseFactory<
              ListTriggersRequest, ListTriggersResponse, ListTriggersPagedResponse>() {
            @Override
            public ApiFuture<ListTriggersPagedResponse> getFuturePagedResponse(
                UnaryCallable<ListTriggersRequest, ListTriggersResponse> callable,
                ListTriggersRequest request,
                ApiCallContext context,
                ApiFuture<ListTriggersResponse> futureResponse) {
              PageContext<ListTriggersRequest, ListTriggersResponse, Trigger> pageContext =
                  PageContext.create(callable, LIST_TRIGGERS_PAGE_STR_DESC, request, context);
              return ListTriggersPagedResponse.createAsync(pageContext, futureResponse);
            }
          };

  /** Returns the object with the settings used for calls to getTrigger. */
  public UnaryCallSettings<GetTriggerRequest, Trigger> getTriggerSettings() {
    return getTriggerSettings;
  }

  /** Returns the object with the settings used for calls to listTriggers. */
  public PagedCallSettings<ListTriggersRequest, ListTriggersResponse, ListTriggersPagedResponse>
      listTriggersSettings() {
    return listTriggersSettings;
  }

  /** Returns the object with the settings used for calls to createTrigger. */
  public UnaryCallSettings<CreateTriggerRequest, Operation> createTriggerSettings() {
    return createTriggerSettings;
  }

  /** Returns the object with the settings used for calls to createTrigger. */
  public OperationCallSettings<CreateTriggerRequest, Trigger, OperationMetadata>
      createTriggerOperationSettings() {
    return createTriggerOperationSettings;
  }

  /** Returns the object with the settings used for calls to updateTrigger. */
  public UnaryCallSettings<UpdateTriggerRequest, Operation> updateTriggerSettings() {
    return updateTriggerSettings;
  }

  /** Returns the object with the settings used for calls to updateTrigger. */
  public OperationCallSettings<UpdateTriggerRequest, Trigger, OperationMetadata>
      updateTriggerOperationSettings() {
    return updateTriggerOperationSettings;
  }

  /** Returns the object with the settings used for calls to deleteTrigger. */
  public UnaryCallSettings<DeleteTriggerRequest, Operation> deleteTriggerSettings() {
    return deleteTriggerSettings;
  }

  /** Returns the object with the settings used for calls to deleteTrigger. */
  public OperationCallSettings<DeleteTriggerRequest, Trigger, OperationMetadata>
      deleteTriggerOperationSettings() {
    return deleteTriggerOperationSettings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public EventarcStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcEventarcStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return "eventarc.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "eventarc.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder().setScopesToApply(DEFAULT_SERVICE_SCOPES);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken("gapic", GaxProperties.getLibraryVersion(EventarcStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected EventarcStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    getTriggerSettings = settingsBuilder.getTriggerSettings().build();
    listTriggersSettings = settingsBuilder.listTriggersSettings().build();
    createTriggerSettings = settingsBuilder.createTriggerSettings().build();
    createTriggerOperationSettings = settingsBuilder.createTriggerOperationSettings().build();
    updateTriggerSettings = settingsBuilder.updateTriggerSettings().build();
    updateTriggerOperationSettings = settingsBuilder.updateTriggerOperationSettings().build();
    deleteTriggerSettings = settingsBuilder.deleteTriggerSettings().build();
    deleteTriggerOperationSettings = settingsBuilder.deleteTriggerOperationSettings().build();
  }

  /** Builder for EventarcStubSettings. */
  public static class Builder extends StubSettings.Builder<EventarcStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<GetTriggerRequest, Trigger> getTriggerSettings;
    private final PagedCallSettings.Builder<
            ListTriggersRequest, ListTriggersResponse, ListTriggersPagedResponse>
        listTriggersSettings;
    private final UnaryCallSettings.Builder<CreateTriggerRequest, Operation> createTriggerSettings;
    private final OperationCallSettings.Builder<CreateTriggerRequest, Trigger, OperationMetadata>
        createTriggerOperationSettings;
    private final UnaryCallSettings.Builder<UpdateTriggerRequest, Operation> updateTriggerSettings;
    private final OperationCallSettings.Builder<UpdateTriggerRequest, Trigger, OperationMetadata>
        updateTriggerOperationSettings;
    private final UnaryCallSettings.Builder<DeleteTriggerRequest, Operation> deleteTriggerSettings;
    private final OperationCallSettings.Builder<DeleteTriggerRequest, Trigger, OperationMetadata>
        deleteTriggerOperationSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put("no_retry_codes", ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList()));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings = RetrySettings.newBuilder().setRpcTimeoutMultiplier(1.0).build();
      definitions.put("no_retry_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      getTriggerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      listTriggersSettings = PagedCallSettings.newBuilder(LIST_TRIGGERS_PAGE_STR_FACT);
      createTriggerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      createTriggerOperationSettings = OperationCallSettings.newBuilder();
      updateTriggerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      updateTriggerOperationSettings = OperationCallSettings.newBuilder();
      deleteTriggerSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      deleteTriggerOperationSettings = OperationCallSettings.newBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getTriggerSettings,
              listTriggersSettings,
              createTriggerSettings,
              updateTriggerSettings,
              deleteTriggerSettings);
      initDefaults(this);
    }

    protected Builder(EventarcStubSettings settings) {
      super(settings);

      getTriggerSettings = settings.getTriggerSettings.toBuilder();
      listTriggersSettings = settings.listTriggersSettings.toBuilder();
      createTriggerSettings = settings.createTriggerSettings.toBuilder();
      createTriggerOperationSettings = settings.createTriggerOperationSettings.toBuilder();
      updateTriggerSettings = settings.updateTriggerSettings.toBuilder();
      updateTriggerOperationSettings = settings.updateTriggerOperationSettings.toBuilder();
      deleteTriggerSettings = settings.deleteTriggerSettings.toBuilder();
      deleteTriggerOperationSettings = settings.deleteTriggerOperationSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              getTriggerSettings,
              listTriggersSettings,
              createTriggerSettings,
              updateTriggerSettings,
              deleteTriggerSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setEndpoint(getDefaultEndpoint());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .getTriggerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .listTriggersSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createTriggerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .updateTriggerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .deleteTriggerSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"));

      builder
          .createTriggerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<CreateTriggerRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Trigger.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .updateTriggerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<UpdateTriggerRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Trigger.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      builder
          .deleteTriggerOperationSettings()
          .setInitialCallSettings(
              UnaryCallSettings
                  .<DeleteTriggerRequest, OperationSnapshot>newUnaryCallSettingsBuilder()
                  .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("no_retry_codes"))
                  .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("no_retry_params"))
                  .build())
          .setResponseTransformer(
              ProtoOperationTransformers.ResponseTransformer.create(Trigger.class))
          .setMetadataTransformer(
              ProtoOperationTransformers.MetadataTransformer.create(OperationMetadata.class))
          .setPollingAlgorithm(
              OperationTimedPollAlgorithm.create(
                  RetrySettings.newBuilder()
                      .setInitialRetryDelay(Duration.ofMillis(5000L))
                      .setRetryDelayMultiplier(1.5)
                      .setMaxRetryDelay(Duration.ofMillis(45000L))
                      .setInitialRpcTimeout(Duration.ZERO)
                      .setRpcTimeoutMultiplier(1.0)
                      .setMaxRpcTimeout(Duration.ZERO)
                      .setTotalTimeout(Duration.ofMillis(300000L))
                      .build()));

      return builder;
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to getTrigger. */
    public UnaryCallSettings.Builder<GetTriggerRequest, Trigger> getTriggerSettings() {
      return getTriggerSettings;
    }

    /** Returns the builder for the settings used for calls to listTriggers. */
    public PagedCallSettings.Builder<
            ListTriggersRequest, ListTriggersResponse, ListTriggersPagedResponse>
        listTriggersSettings() {
      return listTriggersSettings;
    }

    /** Returns the builder for the settings used for calls to createTrigger. */
    public UnaryCallSettings.Builder<CreateTriggerRequest, Operation> createTriggerSettings() {
      return createTriggerSettings;
    }

    /** Returns the builder for the settings used for calls to createTrigger. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<CreateTriggerRequest, Trigger, OperationMetadata>
        createTriggerOperationSettings() {
      return createTriggerOperationSettings;
    }

    /** Returns the builder for the settings used for calls to updateTrigger. */
    public UnaryCallSettings.Builder<UpdateTriggerRequest, Operation> updateTriggerSettings() {
      return updateTriggerSettings;
    }

    /** Returns the builder for the settings used for calls to updateTrigger. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<UpdateTriggerRequest, Trigger, OperationMetadata>
        updateTriggerOperationSettings() {
      return updateTriggerOperationSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTrigger. */
    public UnaryCallSettings.Builder<DeleteTriggerRequest, Operation> deleteTriggerSettings() {
      return deleteTriggerSettings;
    }

    /** Returns the builder for the settings used for calls to deleteTrigger. */
    @BetaApi(
        "The surface for use by generated code is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteTriggerRequest, Trigger, OperationMetadata>
        deleteTriggerOperationSettings() {
      return deleteTriggerOperationSettings;
    }

    @Override
    public EventarcStubSettings build() throws IOException {
      return new EventarcStubSettings(this);
    }
  }
}
