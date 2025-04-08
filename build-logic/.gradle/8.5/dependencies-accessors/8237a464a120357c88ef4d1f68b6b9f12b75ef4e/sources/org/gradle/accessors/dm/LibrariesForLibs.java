package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AccompanistLibraryAccessors laccForAccompanistLibraryAccessors = new AccompanistLibraryAccessors(owner);
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final Coil3LibraryAccessors laccForCoil3LibraryAccessors = new Coil3LibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final CoroutinesLibraryAccessors laccForCoroutinesLibraryAccessors = new CoroutinesLibraryAccessors(owner);
    private final ImageLibraryAccessors laccForImageLibraryAccessors = new ImageLibraryAccessors(owner);
    private final KoinLibraryAccessors laccForKoinLibraryAccessors = new KoinLibraryAccessors(owner);
    private final KotestLibraryAccessors laccForKotestLibraryAccessors = new KotestLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final KotlinxLibraryAccessors laccForKotlinxLibraryAccessors = new KotlinxLibraryAccessors(owner);
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final MapsLibraryAccessors laccForMapsLibraryAccessors = new MapsLibraryAccessors(owner);
    private final MockkLibraryAccessors laccForMockkLibraryAccessors = new MockkLibraryAccessors(owner);
    private final MvvmLibraryAccessors laccForMvvmLibraryAccessors = new MvvmLibraryAccessors(owner);
    private final PlayLibraryAccessors laccForPlayLibraryAccessors = new PlayLibraryAccessors(owner);
    private final PrecomposeLibraryAccessors laccForPrecomposeLibraryAccessors = new PrecomposeLibraryAccessors(owner);
    private final SqldelightLibraryAccessors laccForSqldelightLibraryAccessors = new SqldelightLibraryAccessors(owner);
    private final SystemLibraryAccessors laccForSystemLibraryAccessors = new SystemLibraryAccessors(owner);
    private final TurbineLibraryAccessors laccForTurbineLibraryAccessors = new TurbineLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Returns the group of libraries at accompanist
     */
    public AccompanistLibraryAccessors getAccompanist() {
        return laccForAccompanistLibraryAccessors;
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coil3
     */
    public Coil3LibraryAccessors getCoil3() {
        return laccForCoil3LibraryAccessors;
    }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() {
        return laccForComposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coroutines
     */
    public CoroutinesLibraryAccessors getCoroutines() {
        return laccForCoroutinesLibraryAccessors;
    }

    /**
     * Returns the group of libraries at image
     */
    public ImageLibraryAccessors getImage() {
        return laccForImageLibraryAccessors;
    }

    /**
     * Returns the group of libraries at koin
     */
    public KoinLibraryAccessors getKoin() {
        return laccForKoinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotest
     */
    public KotestLibraryAccessors getKotest() {
        return laccForKotestLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kotlinx
     */
    public KotlinxLibraryAccessors getKotlinx() {
        return laccForKotlinxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ktor
     */
    public KtorLibraryAccessors getKtor() {
        return laccForKtorLibraryAccessors;
    }

    /**
     * Returns the group of libraries at maps
     */
    public MapsLibraryAccessors getMaps() {
        return laccForMapsLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mockk
     */
    public MockkLibraryAccessors getMockk() {
        return laccForMockkLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mvvm
     */
    public MvvmLibraryAccessors getMvvm() {
        return laccForMvvmLibraryAccessors;
    }

    /**
     * Returns the group of libraries at play
     */
    public PlayLibraryAccessors getPlay() {
        return laccForPlayLibraryAccessors;
    }

    /**
     * Returns the group of libraries at precompose
     */
    public PrecomposeLibraryAccessors getPrecompose() {
        return laccForPrecomposeLibraryAccessors;
    }

    /**
     * Returns the group of libraries at sqldelight
     */
    public SqldelightLibraryAccessors getSqldelight() {
        return laccForSqldelightLibraryAccessors;
    }

    /**
     * Returns the group of libraries at system
     */
    public SystemLibraryAccessors getSystem() {
        return laccForSystemLibraryAccessors;
    }

    /**
     * Returns the group of libraries at turbine
     */
    public TurbineLibraryAccessors getTurbine() {
        return laccForTurbineLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class AccompanistLibraryAccessors extends SubDependencyFactory {

        public AccompanistLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for permissions (com.google.accompanist:accompanist-permissions)
         * with versionRef 'accompanist.permissions'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPermissions() {
                return create("accompanist.permissions");
        }

    }

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {
        private final AndroidxActivityLibraryAccessors laccForAndroidxActivityLibraryAccessors = new AndroidxActivityLibraryAccessors(owner);
        private final AndroidxDatastoreLibraryAccessors laccForAndroidxDatastoreLibraryAccessors = new AndroidxDatastoreLibraryAccessors(owner);
        private final AndroidxLifecycleLibraryAccessors laccForAndroidxLifecycleLibraryAccessors = new AndroidxLifecycleLibraryAccessors(owner);

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
         * with versionRef 'androidx.appcompat'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppcompat() {
                return create("androidx.appcompat");
        }

            /**
             * Creates a dependency provider for core (androidx.core:core-ktx)
         * with versionRef 'androidx.core'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.core");
        }

        /**
         * Returns the group of libraries at androidx.activity
         */
        public AndroidxActivityLibraryAccessors getActivity() {
            return laccForAndroidxActivityLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.datastore
         */
        public AndroidxDatastoreLibraryAccessors getDatastore() {
            return laccForAndroidxDatastoreLibraryAccessors;
        }

        /**
         * Returns the group of libraries at androidx.lifecycle
         */
        public AndroidxLifecycleLibraryAccessors getLifecycle() {
            return laccForAndroidxLifecycleLibraryAccessors;
        }

    }

    public static class AndroidxActivityLibraryAccessors extends SubDependencyFactory {

        public AndroidxActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
         * with versionRef 'androidx.activityCompose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.activity.compose");
        }

    }

    public static class AndroidxDatastoreLibraryAccessors extends SubDependencyFactory {
        private final AndroidxDatastorePreferencesLibraryAccessors laccForAndroidxDatastorePreferencesLibraryAccessors = new AndroidxDatastorePreferencesLibraryAccessors(owner);

        public AndroidxDatastoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.datastore.preferences
         */
        public AndroidxDatastorePreferencesLibraryAccessors getPreferences() {
            return laccForAndroidxDatastorePreferencesLibraryAccessors;
        }

    }

    public static class AndroidxDatastorePreferencesLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public AndroidxDatastorePreferencesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for preferences (androidx.datastore:datastore-preferences)
         * with versionRef 'androidx.datastore'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("androidx.datastore.preferences");
        }

            /**
             * Creates a dependency provider for core (androidx.datastore:datastore-preferences-core)
         * with versionRef 'androidx.datastore'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.datastore.preferences.core");
        }

    }

    public static class AndroidxLifecycleLibraryAccessors extends SubDependencyFactory {
        private final AndroidxLifecycleViewmodelLibraryAccessors laccForAndroidxLifecycleViewmodelLibraryAccessors = new AndroidxLifecycleViewmodelLibraryAccessors(owner);

        public AndroidxLifecycleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at androidx.lifecycle.viewmodel
         */
        public AndroidxLifecycleViewmodelLibraryAccessors getViewmodel() {
            return laccForAndroidxLifecycleViewmodelLibraryAccessors;
        }

    }

    public static class AndroidxLifecycleViewmodelLibraryAccessors extends SubDependencyFactory {

        public AndroidxLifecycleViewmodelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (org.jetbrains.androidx.lifecycle:lifecycle-viewmodel-compose)
         * with versionRef 'androidx.lifecycle'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("androidx.lifecycle.viewmodel.compose");
        }

    }

    public static class Coil3LibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public Coil3LibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coil3 (io.coil-kt.coil3:coil-compose)
         * with versionRef 'coil3.io'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("coil3");
        }

            /**
             * Creates a dependency provider for core (io.coil-kt.coil3:coil-core)
         * with versionRef 'coil3.io'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("coil3.core");
        }

            /**
             * Creates a dependency provider for gif (io.coil-kt.coil3:coil-gif)
         * with versionRef 'coil3.io'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGif() {
                return create("coil3.gif");
        }

            /**
             * Creates a dependency provider for network (io.coil-kt.coil3:coil-network)
         * with versionRef 'coil3.io'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNetwork() {
                return create("coil3.network");
        }

            /**
             * Creates a dependency provider for svg (io.coil-kt.coil3:coil-svg)
         * with versionRef 'coil3.io'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSvg() {
                return create("coil3.svg");
        }

            /**
             * Creates a dependency provider for video (io.coil-kt.coil3:coil-video)
         * with versionRef 'coil3.io'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVideo() {
                return create("coil3.video");
        }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeUiLibraryAccessors laccForComposeUiLibraryAccessors = new ComposeUiLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() {
                return create("compose.foundation");
        }

            /**
             * Creates a dependency provider for icons (androidx.compose.material:material-icons-extended)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIcons() {
                return create("compose.icons");
        }

            /**
             * Creates a dependency provider for material3 (androidx.compose.material3:material3)
         * with versionRef 'compose.material3'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial3() {
                return create("compose.material3");
        }

            /**
             * Creates a dependency provider for navigation (org.jetbrains.androidx.navigation:navigation-compose)
         * with versionRef 'compose.navigation.ver'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() {
                return create("compose.navigation");
        }

        /**
         * Returns the group of libraries at compose.ui
         */
        public ComposeUiLibraryAccessors getUi() {
            return laccForComposeUiLibraryAccessors;
        }

    }

    public static class ComposeUiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final ComposeUiToolingLibraryAccessors laccForComposeUiToolingLibraryAccessors = new ComposeUiToolingLibraryAccessors(owner);

        public ComposeUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.ui");
        }

        /**
         * Returns the group of libraries at compose.ui.tooling
         */
        public ComposeUiToolingLibraryAccessors getTooling() {
            return laccForComposeUiToolingLibraryAccessors;
        }

    }

    public static class ComposeUiToolingLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public ComposeUiToolingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tooling (androidx.compose.ui:ui-tooling)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("compose.ui.tooling");
        }

            /**
             * Creates a dependency provider for preview (androidx.compose.ui:ui-tooling-preview)
         * with versionRef 'compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPreview() {
                return create("compose.ui.tooling.preview");
        }

    }

    public static class CoroutinesLibraryAccessors extends SubDependencyFactory {

        public CoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlinx:kotlinx-coroutines-test)
         * with versionRef 'coroutines.test.ver'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("coroutines.test");
        }

    }

    public static class ImageLibraryAccessors extends SubDependencyFactory {

        public ImageLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for loader (io.github.qdsfdhvh:image-loader)
         * with versionRef 'image.loader.qdsfdhvh'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLoader() {
                return create("image.loader");
        }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory {

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (io.insert-koin:koin-android)
         * with versionRef 'koin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("koin.android");
        }

            /**
             * Creates a dependency provider for compose (io.insert-koin:koin-compose)
         * with versionRef 'koin.compose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("koin.compose");
        }

            /**
             * Creates a dependency provider for core (io.insert-koin:koin-core)
         * with versionRef 'koin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("koin.core");
        }

    }

    public static class KotestLibraryAccessors extends SubDependencyFactory {
        private final KotestAssertionsLibraryAccessors laccForKotestAssertionsLibraryAccessors = new KotestAssertionsLibraryAccessors(owner);
        private final KotestFrameworkLibraryAccessors laccForKotestFrameworkLibraryAccessors = new KotestFrameworkLibraryAccessors(owner);

        public KotestLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for property (io.kotest:kotest-property)
         * with versionRef 'kotest'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getProperty() {
                return create("kotest.property");
        }

        /**
         * Returns the group of libraries at kotest.assertions
         */
        public KotestAssertionsLibraryAccessors getAssertions() {
            return laccForKotestAssertionsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotest.framework
         */
        public KotestFrameworkLibraryAccessors getFramework() {
            return laccForKotestFrameworkLibraryAccessors;
        }

    }

    public static class KotestAssertionsLibraryAccessors extends SubDependencyFactory {

        public KotestAssertionsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.kotest:kotest-assertions-core)
         * with versionRef 'kotest'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotest.assertions.core");
        }

    }

    public static class KotestFrameworkLibraryAccessors extends SubDependencyFactory {

        public KotestFrameworkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for engine (io.kotest:kotest-framework-engine)
         * with versionRef 'kotest'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getEngine() {
                return create("kotest.framework.engine");
        }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.jetbrains.kotlin:kotlin-test)
         * with versionRef 'kotlin'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTest() {
                return create("kotlin.test");
        }

    }

    public static class KotlinxLibraryAccessors extends SubDependencyFactory {
        private final KotlinxComponentsLibraryAccessors laccForKotlinxComponentsLibraryAccessors = new KotlinxComponentsLibraryAccessors(owner);
        private final KotlinxCoroutinesLibraryAccessors laccForKotlinxCoroutinesLibraryAccessors = new KotlinxCoroutinesLibraryAccessors(owner);
        private final KotlinxSerializationLibraryAccessors laccForKotlinxSerializationLibraryAccessors = new KotlinxSerializationLibraryAccessors(owner);

        public KotlinxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for datetime (org.jetbrains.kotlinx:kotlinx-datetime)
         * with versionRef 'kotlinx.datetime'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatetime() {
                return create("kotlinx.datetime");
        }

        /**
         * Returns the group of libraries at kotlinx.components
         */
        public KotlinxComponentsLibraryAccessors getComponents() {
            return laccForKotlinxComponentsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlinx.coroutines
         */
        public KotlinxCoroutinesLibraryAccessors getCoroutines() {
            return laccForKotlinxCoroutinesLibraryAccessors;
        }

        /**
         * Returns the group of libraries at kotlinx.serialization
         */
        public KotlinxSerializationLibraryAccessors getSerialization() {
            return laccForKotlinxSerializationLibraryAccessors;
        }

    }

    public static class KotlinxComponentsLibraryAccessors extends SubDependencyFactory {

        public KotlinxComponentsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for resources (org.jetbrains.compose.components:components-resources)
         * with versionRef 'kotlinx.components.resources.ver'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getResources() {
                return create("kotlinx.components.resources");
        }

    }

    public static class KotlinxCoroutinesLibraryAccessors extends SubDependencyFactory {

        public KotlinxCoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
         * with versionRef 'kotlinxCoroutinesCore'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("kotlinx.coroutines.core");
        }

    }

    public static class KotlinxSerializationLibraryAccessors extends SubDependencyFactory {

        public KotlinxSerializationLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for json (org.jetbrains.kotlinx:kotlinx-serialization-json)
         * with versionRef 'kotlinx.serialization.json.ver'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJson() {
                return create("kotlinx.serialization.json");
        }

    }

    public static class KtorLibraryAccessors extends SubDependencyFactory {
        private final KtorDarwinLibraryAccessors laccForKtorDarwinLibraryAccessors = new KtorDarwinLibraryAccessors(owner);

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.ktor:ktor-client-core)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("ktor.core");
        }

            /**
             * Creates a dependency provider for ios (io.ktor:ktor-client-ios)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIos() {
                return create("ktor.ios");
        }

            /**
             * Creates a dependency provider for logging (io.ktor:ktor-client-logging)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() {
                return create("ktor.logging");
        }

            /**
             * Creates a dependency provider for mock (io.ktor:ktor-client-mock)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMock() {
                return create("ktor.mock");
        }

            /**
             * Creates a dependency provider for negotiation (io.ktor:ktor-client-content-negotiation)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNegotiation() {
                return create("ktor.negotiation");
        }

            /**
             * Creates a dependency provider for okhttp (io.ktor:ktor-client-okhttp)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
                return create("ktor.okhttp");
        }

            /**
             * Creates a dependency provider for serialization (io.ktor:ktor-serialization-kotlinx-json)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSerialization() {
                return create("ktor.serialization");
        }

        /**
         * Returns the group of libraries at ktor.darwin
         */
        public KtorDarwinLibraryAccessors getDarwin() {
            return laccForKtorDarwinLibraryAccessors;
        }

    }

    public static class KtorDarwinLibraryAccessors extends SubDependencyFactory {

        public KtorDarwinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ios (io.ktor:ktor-client-darwin)
         * with versionRef 'ktor'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIos() {
                return create("ktor.darwin.ios");
        }

    }

    public static class MapsLibraryAccessors extends SubDependencyFactory {

        public MapsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (com.google.maps.android:maps-compose)
         * with versionRef 'mapCompose'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("maps.compose");
        }

    }

    public static class MockkLibraryAccessors extends SubDependencyFactory {

        public MockkLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for io (io.mockk:mockk)
         * with versionRef 'mockk'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIo() {
                return create("mockk.io");
        }

    }

    public static class MvvmLibraryAccessors extends SubDependencyFactory {
        private final MvvmFlowLibraryAccessors laccForMvvmFlowLibraryAccessors = new MvvmFlowLibraryAccessors(owner);

        public MvvmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (dev.icerock.moko:mvvm-compose)
         * with versionRef 'mokoVersion'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("mvvm.compose");
        }

            /**
             * Creates a dependency provider for core (dev.icerock.moko:mvvm-core)
         * with versionRef 'mokoVersion'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("mvvm.core");
        }

        /**
         * Returns the group of libraries at mvvm.flow
         */
        public MvvmFlowLibraryAccessors getFlow() {
            return laccForMvvmFlowLibraryAccessors;
        }

    }

    public static class MvvmFlowLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MvvmFlowLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for flow (dev.icerock.moko:mvvm-flow)
         * with versionRef 'mokoVersion'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("mvvm.flow");
        }

            /**
             * Creates a dependency provider for compose (dev.icerock.moko:mvvm-flow-compose)
         * with versionRef 'mokoVersion'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("mvvm.flow.compose");
        }

    }

    public static class PlayLibraryAccessors extends SubDependencyFactory {
        private final PlayServicesLibraryAccessors laccForPlayServicesLibraryAccessors = new PlayServicesLibraryAccessors(owner);

        public PlayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at play.services
         */
        public PlayServicesLibraryAccessors getServices() {
            return laccForPlayServicesLibraryAccessors;
        }

    }

    public static class PlayServicesLibraryAccessors extends SubDependencyFactory {

        public PlayServicesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for location (com.google.android.gms:play-services-location)
         * with versionRef 'play.services.location'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLocation() {
                return create("play.services.location");
        }

            /**
             * Creates a dependency provider for maps (com.google.android.gms:play-services-maps)
         * with versionRef 'play.services.maps'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaps() {
                return create("play.services.maps");
        }

    }

    public static class PrecomposeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public PrecomposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for precompose (moe.tlaster:precompose)
         * with versionRef 'precompose.tlaster'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("precompose");
        }

            /**
             * Creates a dependency provider for koin (moe.tlaster:precompose-koin)
         * with versionRef 'precompose.tlaster'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKoin() {
                return create("precompose.koin");
        }

            /**
             * Creates a dependency provider for viewmodel (moe.tlaster:precompose-viewmodel)
         * with versionRef 'precompose.viewmodel.tlaster'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewmodel() {
                return create("precompose.viewmodel");
        }

    }

    public static class SqldelightLibraryAccessors extends SubDependencyFactory {

        public SqldelightLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (app.cash.sqldelight:android-driver)
         * with versionRef 'sqldelight'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() {
                return create("sqldelight.android");
        }

            /**
             * Creates a dependency provider for ios (app.cash.sqldelight:native-driver)
         * with versionRef 'sqldelight'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getIos() {
                return create("sqldelight.ios");
        }

    }

    public static class SystemLibraryAccessors extends SubDependencyFactory {
        private final SystemUiLibraryAccessors laccForSystemUiLibraryAccessors = new SystemUiLibraryAccessors(owner);

        public SystemLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at system.ui
         */
        public SystemUiLibraryAccessors getUi() {
            return laccForSystemUiLibraryAccessors;
        }

    }

    public static class SystemUiLibraryAccessors extends SubDependencyFactory {

        public SystemUiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for controller (com.google.accompanist:accompanist-systemuicontroller)
         * with versionRef 'accompanist.version'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getController() {
                return create("system.ui.controller");
        }

    }

    public static class TurbineLibraryAccessors extends SubDependencyFactory {

        public TurbineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for turbine (app.cash.turbine:turbine)
         * with versionRef 'turbine'.
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getTurbine() {
                return create("turbine.turbine");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AccompanistVersionAccessors vaccForAccompanistVersionAccessors = new AccompanistVersionAccessors(providers, config);
        private final AndroidVersionAccessors vaccForAndroidVersionAccessors = new AndroidVersionAccessors(providers, config);
        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final Coil3VersionAccessors vaccForCoil3VersionAccessors = new Coil3VersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final CoroutinesVersionAccessors vaccForCoroutinesVersionAccessors = new CoroutinesVersionAccessors(providers, config);
        private final ImageVersionAccessors vaccForImageVersionAccessors = new ImageVersionAccessors(providers, config);
        private final KoinVersionAccessors vaccForKoinVersionAccessors = new KoinVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final PlayVersionAccessors vaccForPlayVersionAccessors = new PlayVersionAccessors(providers, config);
        private final PrecomposeVersionAccessors vaccForPrecomposeVersionAccessors = new PrecomposeVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: agp (8.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAgp() { return getVersion("agp"); }

            /**
             * Returns the version associated to this alias: kotest (5.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotest() { return getVersion("kotest"); }

            /**
             * Returns the version associated to this alias: kotlin (2.1.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: kotlinxCoroutinesCore (1.8.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlinxCoroutinesCore() { return getVersion("kotlinxCoroutinesCore"); }

            /**
             * Returns the version associated to this alias: ktlint (12.1.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtlint() { return getVersion("ktlint"); }

            /**
             * Returns the version associated to this alias: ktor (2.3.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: mapCompose (6.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMapCompose() { return getVersion("mapCompose"); }

            /**
             * Returns the version associated to this alias: mockk (1.8.13.kotlin13)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMockk() { return getVersion("mockk"); }

            /**
             * Returns the version associated to this alias: mokoVersion (0.16.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMokoVersion() { return getVersion("mokoVersion"); }

            /**
             * Returns the version associated to this alias: sqldelight (2.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSqldelight() { return getVersion("sqldelight"); }

            /**
             * Returns the version associated to this alias: turbine (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTurbine() { return getVersion("turbine"); }

        /**
         * Returns the group of versions at versions.accompanist
         */
        public AccompanistVersionAccessors getAccompanist() {
            return vaccForAccompanistVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.android
         */
        public AndroidVersionAccessors getAndroid() {
            return vaccForAndroidVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.coil3
         */
        public Coil3VersionAccessors getCoil3() {
            return vaccForCoil3VersionAccessors;
        }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() {
            return vaccForComposeVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.coroutines
         */
        public CoroutinesVersionAccessors getCoroutines() {
            return vaccForCoroutinesVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.image
         */
        public ImageVersionAccessors getImage() {
            return vaccForImageVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.koin
         */
        public KoinVersionAccessors getKoin() {
            return vaccForKoinVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() {
            return vaccForKotlinxVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.play
         */
        public PlayVersionAccessors getPlay() {
            return vaccForPlayVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.precompose
         */
        public PrecomposeVersionAccessors getPrecompose() {
            return vaccForPrecomposeVersionAccessors;
        }

    }

    public static class AccompanistVersionAccessors extends VersionFactory  {

        public AccompanistVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: accompanist.permissions (0.32.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPermissions() { return getVersion("accompanist.permissions"); }

            /**
             * Returns the version associated to this alias: accompanist.version (0.33.2-alpha)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVersion() { return getVersion("accompanist.version"); }

    }

    public static class AndroidVersionAccessors extends VersionFactory  {

        private final AndroidVersionVersionAccessors vaccForAndroidVersionVersionAccessors = new AndroidVersionVersionAccessors(providers, config);
        public AndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: android.compileSdk (35)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompileSdk() { return getVersion("android.compileSdk"); }

            /**
             * Returns the version associated to this alias: android.minSdk (24)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMinSdk() { return getVersion("android.minSdk"); }

            /**
             * Returns the version associated to this alias: android.targetSdk (35)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTargetSdk() { return getVersion("android.targetSdk"); }

        /**
         * Returns the group of versions at versions.android.version
         */
        public AndroidVersionVersionAccessors getVersion() {
            return vaccForAndroidVersionVersionAccessors;
        }

    }

    public static class AndroidVersionVersionAccessors extends VersionFactory  {

        public AndroidVersionVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: android.version.code (1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCode() { return getVersion("android.version.code"); }

            /**
             * Returns the version associated to this alias: android.version.name (1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getName() { return getVersion("android.version.name"); }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.activityCompose (1.10.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivityCompose() { return getVersion("androidx.activityCompose"); }

            /**
             * Returns the version associated to this alias: androidx.appcompat (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("androidx.appcompat"); }

            /**
             * Returns the version associated to this alias: androidx.core (1.15.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

            /**
             * Returns the version associated to this alias: androidx.datastore (1.1.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatastore() { return getVersion("androidx.datastore"); }

            /**
             * Returns the version associated to this alias: androidx.lifecycle (2.8.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("androidx.lifecycle"); }

    }

    public static class Coil3VersionAccessors extends VersionFactory  {

        public Coil3VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: coil3.io (3.0.0-alpha01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getIo() { return getVersion("coil3.io"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        private final ComposeNavigationVersionAccessors vaccForComposeNavigationVersionAccessors = new ComposeNavigationVersionAccessors(providers, config);
        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: compose (1.7.8)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("compose"); }

            /**
             * Returns the version associated to this alias: compose.compiler (1.5.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompiler() { return getVersion("compose.compiler"); }

            /**
             * Returns the version associated to this alias: compose.material3 (1.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaterial3() { return getVersion("compose.material3"); }

            /**
             * Returns the version associated to this alias: compose.multiplatform (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMultiplatform() { return getVersion("compose.multiplatform"); }

            /**
             * Returns the version associated to this alias: compose.plugin (1.5.11)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("compose.plugin"); }

        /**
         * Returns the group of versions at versions.compose.navigation
         */
        public ComposeNavigationVersionAccessors getNavigation() {
            return vaccForComposeNavigationVersionAccessors;
        }

    }

    public static class ComposeNavigationVersionAccessors extends VersionFactory  {

        public ComposeNavigationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: compose.navigation.ver (2.8.0-alpha11)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVer() { return getVersion("compose.navigation.ver"); }

    }

    public static class CoroutinesVersionAccessors extends VersionFactory  {

        private final CoroutinesTestVersionAccessors vaccForCoroutinesTestVersionAccessors = new CoroutinesTestVersionAccessors(providers, config);
        public CoroutinesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.coroutines.test
         */
        public CoroutinesTestVersionAccessors getTest() {
            return vaccForCoroutinesTestVersionAccessors;
        }

    }

    public static class CoroutinesTestVersionAccessors extends VersionFactory  {

        public CoroutinesTestVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: coroutines.test.ver (1.8.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVer() { return getVersion("coroutines.test.ver"); }

    }

    public static class ImageVersionAccessors extends VersionFactory  {

        private final ImageLoaderVersionAccessors vaccForImageLoaderVersionAccessors = new ImageLoaderVersionAccessors(providers, config);
        public ImageVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.image.loader
         */
        public ImageLoaderVersionAccessors getLoader() {
            return vaccForImageLoaderVersionAccessors;
        }

    }

    public static class ImageLoaderVersionAccessors extends VersionFactory  {

        public ImageLoaderVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: image.loader.qdsfdhvh (1.6.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getQdsfdhvh() { return getVersion("image.loader.qdsfdhvh"); }

    }

    public static class KoinVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public KoinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: koin (4.0.0)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("koin"); }

            /**
             * Returns the version associated to this alias: koin.compose (4.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompose() { return getVersion("koin.compose"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        private final KotlinxComponentsVersionAccessors vaccForKotlinxComponentsVersionAccessors = new KotlinxComponentsVersionAccessors(providers, config);
        private final KotlinxSerializationVersionAccessors vaccForKotlinxSerializationVersionAccessors = new KotlinxSerializationVersionAccessors(providers, config);
        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.datetime (0.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDatetime() { return getVersion("kotlinx.datetime"); }

        /**
         * Returns the group of versions at versions.kotlinx.components
         */
        public KotlinxComponentsVersionAccessors getComponents() {
            return vaccForKotlinxComponentsVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.kotlinx.serialization
         */
        public KotlinxSerializationVersionAccessors getSerialization() {
            return vaccForKotlinxSerializationVersionAccessors;
        }

    }

    public static class KotlinxComponentsVersionAccessors extends VersionFactory  {

        private final KotlinxComponentsResourcesVersionAccessors vaccForKotlinxComponentsResourcesVersionAccessors = new KotlinxComponentsResourcesVersionAccessors(providers, config);
        public KotlinxComponentsVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.kotlinx.components.resources
         */
        public KotlinxComponentsResourcesVersionAccessors getResources() {
            return vaccForKotlinxComponentsResourcesVersionAccessors;
        }

    }

    public static class KotlinxComponentsResourcesVersionAccessors extends VersionFactory  {

        public KotlinxComponentsResourcesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.components.resources.ver (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVer() { return getVersion("kotlinx.components.resources.ver"); }

    }

    public static class KotlinxSerializationVersionAccessors extends VersionFactory  {

        private final KotlinxSerializationJsonVersionAccessors vaccForKotlinxSerializationJsonVersionAccessors = new KotlinxSerializationJsonVersionAccessors(providers, config);
        public KotlinxSerializationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.kotlinx.serialization.json
         */
        public KotlinxSerializationJsonVersionAccessors getJson() {
            return vaccForKotlinxSerializationJsonVersionAccessors;
        }

    }

    public static class KotlinxSerializationJsonVersionAccessors extends VersionFactory  {

        public KotlinxSerializationJsonVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.serialization.json.ver (1.6.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getVer() { return getVersion("kotlinx.serialization.json.ver"); }

    }

    public static class PlayVersionAccessors extends VersionFactory  {

        private final PlayServicesVersionAccessors vaccForPlayServicesVersionAccessors = new PlayServicesVersionAccessors(providers, config);
        public PlayVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.play.services
         */
        public PlayServicesVersionAccessors getServices() {
            return vaccForPlayServicesVersionAccessors;
        }

    }

    public static class PlayServicesVersionAccessors extends VersionFactory  {

        public PlayServicesVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: play.services.location (21.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLocation() { return getVersion("play.services.location"); }

            /**
             * Returns the version associated to this alias: play.services.maps (18.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMaps() { return getVersion("play.services.maps"); }

    }

    public static class PrecomposeVersionAccessors extends VersionFactory  {

        private final PrecomposeViewmodelVersionAccessors vaccForPrecomposeViewmodelVersionAccessors = new PrecomposeViewmodelVersionAccessors(providers, config);
        public PrecomposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: precompose.tlaster (1.5.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTlaster() { return getVersion("precompose.tlaster"); }

        /**
         * Returns the group of versions at versions.precompose.viewmodel
         */
        public PrecomposeViewmodelVersionAccessors getViewmodel() {
            return vaccForPrecomposeViewmodelVersionAccessors;
        }

    }

    public static class PrecomposeViewmodelVersionAccessors extends VersionFactory  {

        public PrecomposeViewmodelVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: precompose.viewmodel.tlaster (1.5.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTlaster() { return getVersion("precompose.viewmodel.tlaster"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final PlayBundleAccessors baccForPlayBundleAccessors = new PlayBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for compose which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.compose.ui:ui</li>
             *    <li>androidx.compose.ui:ui-tooling</li>
             *    <li>androidx.compose.ui:ui-tooling-preview</li>
             *    <li>androidx.compose.foundation:foundation</li>
             *    <li>androidx.compose.material3:material3</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCompose() {
                return createBundle("compose");
            }

            /**
             * Creates a dependency bundle provider for ktor which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.ktor:ktor-client-core</li>
             *    <li>io.ktor:ktor-client-logging</li>
             *    <li>io.ktor:ktor-serialization-kotlinx-json</li>
             *    <li>io.ktor:ktor-client-content-negotiation</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKtor() {
                return createBundle("ktor");
            }

        /**
         * Returns the group of bundles at bundles.play
         */
        public PlayBundleAccessors getPlay() {
            return baccForPlayBundleAccessors;
        }

    }

    public static class PlayBundleAccessors extends BundleFactory {

        public PlayBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for play.services which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.google.android.gms:play-services-location</li>
             *    <li>com.google.android.gms:play-services-maps</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getServices() {
                return createBundle("play.services");
            }

    }

    public static class PluginAccessors extends PluginFactory {
        private final ComposePluginAccessors paccForComposePluginAccessors = new ComposePluginAccessors(providers, config);
        private final KotlinPluginAccessors paccForKotlinPluginAccessors = new KotlinPluginAccessors(providers, config);
        private final ShoppingPluginAccessors paccForShoppingPluginAccessors = new ShoppingPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for androidApplication to the plugin id 'com.android.application'
             * with versionRef 'agp'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidApplication() { return createPlugin("androidApplication"); }

            /**
             * Creates a plugin provider for androidLibrary to the plugin id 'com.android.library'
             * with versionRef 'agp'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidLibrary() { return createPlugin("androidLibrary"); }

            /**
             * Creates a plugin provider for composeMultiplatform to the plugin id 'org.jetbrains.compose'
             * with versionRef 'compose.multiplatform'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getComposeMultiplatform() { return createPlugin("composeMultiplatform"); }

            /**
             * Creates a plugin provider for kotlinAndroid to the plugin id 'org.jetbrains.kotlin.android'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinAndroid() { return createPlugin("kotlinAndroid"); }

            /**
             * Creates a plugin provider for kotlinCocoapods to the plugin id 'org.jetbrains.kotlin.native.cocoapods'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinCocoapods() { return createPlugin("kotlinCocoapods"); }

            /**
             * Creates a plugin provider for kotlinMultiplatform to the plugin id 'org.jetbrains.kotlin.multiplatform'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinMultiplatform() { return createPlugin("kotlinMultiplatform"); }

            /**
             * Creates a plugin provider for ktlint to the plugin id 'org.jlleitschuh.gradle.ktlint'
             * with versionRef 'ktlint'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKtlint() { return createPlugin("ktlint"); }

            /**
             * Creates a plugin provider for sqldelightApp to the plugin id 'app.cash.sqldelight'
             * with versionRef 'sqldelight'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSqldelightApp() { return createPlugin("sqldelightApp"); }

        /**
         * Returns the group of plugins at plugins.compose
         */
        public ComposePluginAccessors getCompose() {
            return paccForComposePluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.kotlin
         */
        public KotlinPluginAccessors getKotlin() {
            return paccForKotlinPluginAccessors;
        }

        /**
         * Returns the group of plugins at plugins.shopping
         */
        public ShoppingPluginAccessors getShopping() {
            return paccForShoppingPluginAccessors;
        }

    }

    public static class ComposePluginAccessors extends PluginFactory {

        public ComposePluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for compose.compiler to the plugin id 'org.jetbrains.kotlin.plugin.compose'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getCompiler() { return createPlugin("compose.compiler"); }

    }

    public static class KotlinPluginAccessors extends PluginFactory {

        public KotlinPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for kotlin.parcelize to the plugin id 'org.jetbrains.kotlin.plugin.parcelize'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getParcelize() { return createPlugin("kotlin.parcelize"); }

            /**
             * Creates a plugin provider for kotlin.serialization to the plugin id 'org.jetbrains.kotlin.plugin.serialization'
             * with versionRef 'kotlin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSerialization() { return createPlugin("kotlin.serialization"); }

    }

    public static class ShoppingPluginAccessors extends PluginFactory {

        public ShoppingPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for shopping.androidApp to the plugin id 'com.razzaghi.shopingbykmp.androidApp'
             * with version 'unspecified'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidApp() { return createPlugin("shopping.androidApp"); }

            /**
             * Creates a plugin provider for shopping.kotlinMultiplatform to the plugin id 'com.razzaghi.shopingbykmp.kotlinMultiplatform'
             * with version 'unspecified'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinMultiplatform() { return createPlugin("shopping.kotlinMultiplatform"); }

            /**
             * Creates a plugin provider for shopping.shared to the plugin id 'com.razzaghi.shopingbykmp.shared'
             * with version 'unspecified'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getShared() { return createPlugin("shopping.shared"); }

    }

}
