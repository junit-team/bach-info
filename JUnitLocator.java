/*
 * Copyright 2024 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */

package run.info.org.junit;

import java.util.Set;
import run.bach.ModuleLocator;

record JUnitLocator(Set<String> names, String group, String version) implements ModuleLocator {
  static JUnitLocator of(String group, String version, String... names) {
    return new JUnitLocator(Set.of(names), group, version);
  }

  @Override
  public Location locate(String name) {
    if (!names().contains(name)) return Location.unknown(name);
    var artifact = name.substring("org.".length()).replace('.', '-');
    return Location.of(name, "pkg:maven/" + group + "/" + artifact + "@" + version);
  }
}
