package io.teragroup.keycloak.extension.migration.domainextension.spi;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class MigrationSpi implements Spi {

    @Override
    public boolean isInternal() {
        return false;
    }

    @Override
    public String getName() {
        return "tera-migration";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return MigrationService.class;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return MigrationServiceProviderFactory.class;
    }

}
