package io.openems.edge.evcs.hardybarth;

import org.osgi.service.metatype.annotations.AttributeDefinition;

import io.openems.edge.common.test.AbstractComponentConfig;
import io.openems.edge.evcs.hardybarth.Config;

@SuppressWarnings("all")
public class MyConfig extends AbstractComponentConfig implements Config {

	protected static class Builder {
		private String id;
		private String ip;
		private int minHwCurrent;

		private Builder() {
		}

		public Builder Builder(String id, String ip, int minHwCurrent) {
			this.id = id;
			this.ip = ip;
			this.minHwCurrent = minHwCurrent;
			return this;
		}

		public Builder setId(String id) {
			this.id = id;
			return this;
		}

		public Builder setIp(String ip) {
			this.ip = ip;
			return this;
		}

		public Builder setMinHwCurrent(int minHwCurrent) {
			this.minHwCurrent = minHwCurrent;
			return this;
		}

		public MyConfig build() {
			return new MyConfig(this);
		}
	}

	/**
	 * Create a Config builder.
	 * 
	 * @return a {@link Builder}
	 */
	public static Builder create() {
		return new Builder();
	}

	private final Builder builder;

	private MyConfig(Builder builder) {
		super(Config.class, builder.id);
		this.builder = builder;
	}

	@Override
	public boolean debugMode() {
		return false;
	}

	@Override
	public String ip() {
		return this.builder.ip;
	}

	@Override
	public int minHwCurrent() {
		return this.builder.minHwCurrent;
	}
}