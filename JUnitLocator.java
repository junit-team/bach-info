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
