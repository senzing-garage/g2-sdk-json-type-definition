// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Collections.Generic;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    /// <summary>
    /// No description.
    /// </summary>
    [JsonConverter(typeof(FeaturesForAttributeJsonConverter))]
    public class FeaturesForAttribute
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<FeatureForAttribute> Value { get; set; }
    }

    public class FeaturesForAttributeJsonConverter : JsonConverter<FeaturesForAttribute>
    {
        public override FeaturesForAttribute Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new FeaturesForAttribute { Value = JsonSerializer.Deserialize<IList<FeatureForAttribute>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, FeaturesForAttribute value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<FeatureForAttribute>>(writer, value.Value, options);
        }
    }
}
