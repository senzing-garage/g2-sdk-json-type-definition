// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    public class EngineStatsResponseWorkload
    {
        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("CorruptEntityTestDiagnosis")]
        public object CorruptEntityTestDiagnosis { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("abortedUnresolve")]
        public int AbortedUnresolve { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("actualAmbiguousTest")]
        public int ActualAmbiguousTest { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("addedRecords")]
        public int AddedRecords { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("apiVersion")]
        public string ApiVersion { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("cacheHit")]
        public AttributeCounters CacheHit { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("cacheMiss")]
        public AttributeCounters CacheMiss { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("cachedAmbiguousTest")]
        public int CachedAmbiguousTest { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("candidateBuilders")]
        public AttributeCounters CandidateBuilders { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("candidates")]
        public int Candidates { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("deletedRecords")]
        public int DeletedRecords { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("duration")]
        public int Duration { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("expressedFeatureCalls")]
        public IList<EngineStatsResponseWorkloadExpressedFeatureCall> ExpressedFeatureCalls { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("expressedFeaturesCreated")]
        public AttributeCounters ExpressedFeaturesCreated { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("filteredObsFeat")]
        public int FilteredObsFeat { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("genericDetect")]
        public AttributeCounters GenericDetect { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("gnrScorersUsed")]
        public int GnrScorersUsed { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("highContentionFeat")]
        public AttributeCounters HighContentionFeat { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("highContentionResEnt")]
        public AttributeCounters HighContentionResEnt { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("latchContention")]
        public AttributeCounters LatchContention { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("libFeatCacheHit")]
        public int LibFeatCacheHit { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("libFeatCacheMiss")]
        public int LibFeatCacheMiss { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("loadedRecords")]
        public int LoadedRecords { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("redoTriggers")]
        public AttributeCounters RedoTriggers { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("reducedScoredFeatureType")]
        public AttributeCounters ReducedScoredFeatureType { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("reevaluations")]
        public int Reevaluations { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("repairedEntities")]
        public int RepairedEntities { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("reresolveSkipped")]
        public int ReresolveSkipped { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("reresolveTriggers")]
        public EngineStatsResponseWorkloadReresolveTriggers ReresolveTriggers { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("resFeatStatCacheHit")]
        public int ResFeatStatCacheHit { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("resFeatStatCacheMiss")]
        public int ResFeatStatCacheMiss { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("resFeatStatUpdate")]
        public int ResFeatStatUpdate { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("retries")]
        public int Retries { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("scoredPairs")]
        public AttributeCounters ScoredPairs { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("suppressedCandidateBuilders")]
        public AttributeCounters SuppressedCandidateBuilders { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("suppressedDisclosedRelationshipDomainCount")]
        public int SuppressedDisclosedRelationshipDomainCount { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("suppressedScoredFeatureType")]
        public AttributeCounters SuppressedScoredFeatureType { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("systemResources")]
        public EngineStatsResponseWorkloadSystemResources SystemResources { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("threadState")]
        public EngineStatsResponseWorkloadThreadState ThreadState { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("unresolveTest")]
        public int UnresolveTest { get; set; }

        /// <summary>
        /// No description.
        /// </summary>
        [JsonPropertyName("unresolveTriggers")]
        public EngineStatsResponseWorkloadUnresolveTriggers UnresolveTriggers { get; set; }
    }
}
