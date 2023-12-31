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
    [JsonConverter(typeof(FeatureDescriptionValuesJsonConverter))]
    public class FeatureDescriptionValues
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public IList<FeatureDescriptionValue> Value { get; set; }
    }

    public class FeatureDescriptionValuesJsonConverter : JsonConverter<FeatureDescriptionValues>
    {
        public override FeatureDescriptionValues Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new FeatureDescriptionValues { Value = JsonSerializer.Deserialize<IList<FeatureDescriptionValue>>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, FeatureDescriptionValues value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<IList<FeatureDescriptionValue>>(writer, value.Value, options);
        }
    }
}
