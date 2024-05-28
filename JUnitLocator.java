package run.info.org.junit;

import run.bach.ModuleLocator;

record JUnitLocator(String group, String version) implements ModuleLocator {
  @Override
  public Location locate(String module) {
    if (module.startsWith(group)) {
      var artifact = module.substring("org.".length()).replace('.', '-');
      return Location.of(module, "pkg:maven/" + group + "/" + artifact + "@" + version);
    }
    return Location.unknown(module);
  }
}
