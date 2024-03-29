// Code generated by jtd-codegen for C# + System.Text.Json v0.2.1

using System;
using System.Text.Json;
using System.Text.Json.Serialization;

namespace Senzing
{
    [JsonConverter(typeof(SzConfigmgrGetConfigResponseJsonConverter))]
    public class SzConfigmgrGetConfigResponse
    {
        /// <summary>
        /// The underlying data being wrapped.
        /// </summary>
        public GetConfig Value { get; set; }
    }

    public class SzConfigmgrGetConfigResponseJsonConverter : JsonConverter<SzConfigmgrGetConfigResponse>
    {
        public override SzConfigmgrGetConfigResponse Read(ref Utf8JsonReader reader, Type typeToConvert, JsonSerializerOptions options)
        {
            return new SzConfigmgrGetConfigResponse { Value = JsonSerializer.Deserialize<GetConfig>(ref reader, options) };
        }

        public override void Write(Utf8JsonWriter writer, SzConfigmgrGetConfigResponse value, JsonSerializerOptions options)
        {
            JsonSerializer.Serialize<GetConfig>(writer, value.Value, options);
        }
    }
}