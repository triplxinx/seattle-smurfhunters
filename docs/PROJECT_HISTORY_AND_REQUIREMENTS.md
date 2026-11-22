# Seattle Smurfhunters / Alder Atlas — History and requirements
## About
Seattle-based native Android exploration and observation app to map likely old-growth alder stands and blackberry habitat, with map overlays, user-taken photographs and a location-aware observation gallery. Habitat probability is an estimate requiring defensible environmental data; the app must not represent guesses as confirmed observations.

## Request/revision history
- 2026-11-07: Requested a native Android Seattle map of old-growth alder groves and likely blackberry bushes, color-coded heatmap built from as many appropriate census/environmental data points as feasible.
- 2026-11-07: Requested satellite base layer, topographic overlay, street view and walk-around functionality, with an immersive in-app map experience.
- 2026-11-07: Renamed app **Seattle Smurfhunters**, with a Smurfs-style hat icon concept; third-party character/brand artwork requires rights clearance or an original non-infringing alternative.
- 2026-11-07: Requested camera button, photo capture, geotagged pin with photo viewer and per-pin gallery; image collection also accessible in app.
- 2026-11-22: New separate public GitHub starter repository created. Existing app builds, if any, need reconciliation.

## Feature inventory
- [ ] Native Android map with seamless in-app pan/zoom, layer switcher and user location permission handling.
- [ ] Satellite imagery (licensed provider), topo/terrain layer, streets and permitted street-level imagery/walk-around integration.
- [ ] Seattle/King County environmental layers for alder distribution, age/old-growth evidence, blackberry occurrence, soils, canopy, land cover, elevation, public access and relevant census context.
- [ ] Clearly distinguished observed vs modeled probability vs unverified crowd-submitted sightings; heatmap legend and confidence/explanation.
- [ ] Photo capture, EXIF/location privacy review, geotagged map pin, pin detail, multi-photo gallery, search/filter, offline cache and exports.
- [ ] Location accuracy indicator, permission-denied fallback, consent and sensitive habitat/location protection.
- [ ] Original recognizable hat-inspired icon that avoids copying protected third-party art; accessible navigation and immersive in-app UX.
- [ ] Data provenance, licensing, update cadence, offline behavior, accessibility and device tests.

## Verified current implementation
- Android activity shell, manifest/Gradle starter, observation JSON schema and roadmap.
- No live map, camera, habitat data, street view, geospatial inference or APK verification.

## TODO
1. [ ] Audit existing Alder Atlas/Seattle Smurfhunters code or attachments before replacing or importing.
2. [ ] Establish reproducible Android build and automated tests.
3. [ ] Choose map SDK/providers with appropriate satellite/topo/street-level licensing and costs.
4. [ ] Source Seattle/King County habitat datasets, record provenance and model uncertainty; avoid unsupported old-growth claims.
5. [ ] Implement Map UI and separate observations from prediction layers.
6. [ ] Add camera pins, gallery, privacy controls and offline caching.
7. [ ] Implement icon, onboarding, immersive interactions and field/device validation.
8. [ ] Record verified changes in CHANGELOG.md.

## Historical integrity
Reconstructed from accessible prompts, not a complete exported conversation archive. Unchecked features remain unimplemented in this starter.
